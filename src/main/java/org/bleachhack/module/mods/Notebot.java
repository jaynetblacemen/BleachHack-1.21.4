package org.bleachhack.module.mods;

import com.google.common.collect.Multimap;
import org.bleachhack.module.Module;
import org.bleachhack.module.ModuleCategory;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Notebot extends Module {
    public Song song;

    public Notebot() {
        super("Notebot", KEY_UNBOUND, ModuleCategory.MISC, "Disabled");
    }

    public static class Song {
        public String filename;
        public String name;
        public String author;
        public String format;
        public Multimap<Integer, Note> notes;
        public Set<Note> requirements = new HashSet<>();
        public int length;

        public Song(String filename, String name, String author, String format, Multimap<Integer, Note> notes) {
            this.filename = filename;
            this.name = name;
            this.author = author;
            this.format = format;
            this.notes = notes;
            notes.values().stream().distinct().forEach(requirements::add);
            length = notes.keySet().stream().max(Comparator.naturalOrder()).orElse(0);
        }
    }

    public static class Note {
        public int pitch;
        public int instrument;
        public Note(int pitch, int instrument) {
            this.pitch = pitch;
            this.instrument = instrument;
        }
        @Override
        public int hashCode() { return pitch * 31 + instrument; }
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Note)) return false;
            Note other = (Note) obj;
            return instrument == other.instrument && pitch == other.pitch;
        }
    }
}