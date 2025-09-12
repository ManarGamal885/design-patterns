package Chapter6.Invoker;

import Chapter6.Commands.Command;
import Chapter6.Commands.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        Command noCommand = new NoCommand();
        Command undoCommand = noCommand;

        onCommands = new Command[2];
        offCommands = new Command[2];
        for (int i = 0; i < 2; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if(onCommands[slot] != null) {
            onCommands[slot].execute();
        }
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        if(onCommands[slot] != null) {
            offCommands[slot].execute();
        }
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        if(undoCommand != null) {
            undoCommand.undo();
        }
    }
     public String toString() {
         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append("\n------ Remote Control -------\n");
         for (int i = 0; i < onCommands.length; i++) {
             stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                     + "    " + offCommands[i].getClass().getName() + "\n");
         }
         return stringBuilder.toString();
     }
}
