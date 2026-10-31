package GierJava.entities.comp;

import arc.struct.Seq;
import ent.anno.Annotations.EntityComponent;
import mindustry.entities.units.StatusEntry;

@EntityComponent
abstract class StatusAccessComp {
    public abstract Seq<StatusEntry> statuses();
}