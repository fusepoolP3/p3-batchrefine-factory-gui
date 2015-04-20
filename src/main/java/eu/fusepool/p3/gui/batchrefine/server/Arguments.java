package eu.fusepool.p3.gui.batchrefine.server;

import org.wymiwyg.commons.util.arguments.ArgumentsWithHelp;
import org.wymiwyg.commons.util.arguments.CommandLine;

public interface Arguments extends ArgumentsWithHelp {
    
    @CommandLine(longName = "port", shortName = {"P"}, required = false,
            defaultValue = "8203",
            description = "The port on which the batchrefine tranformer factory shall listen")
    public int getPort();
    
}
