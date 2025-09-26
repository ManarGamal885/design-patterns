package Chapter6.Test;

import Chapter6.Commands.Command;
import Chapter6.Commands.LightOffCommand;
import Chapter6.Commands.LightOnCommand;
import Chapter6.Commands.MacroCommand;
import Chapter6.Invoker.RemoteControl;
import Chapter6.Invoker.SimpleRemoteControl;
import Chapter6.Receiver.Light;

public class CommandPattern {
    public static void main(String[] args) {
        // Create the receiver
        Light light = new Light("home");
        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen");

        // Create the command
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        Command livingRoomOff = new LightOffCommand(livingRoomLight);
        Command livingRoomOn = new LightOnCommand(livingRoomLight);

        Command kitchenOff = new LightOffCommand(kitchenLight);
        Command kitchenOn = new LightOnCommand(kitchenLight);

        // Invoke the command
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        RemoteControl remoteControl = new RemoteControl();

        // Action 1 : Turn the light on
        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();

        // Action 2 : Turn the light off
        simpleRemoteControl.setCommand(lightOff);
        simpleRemoteControl.buttonWasPressed();

        // Set commands in remote control
        remoteControl.setCommand(0, livingRoomOn, livingRoomOff);
        remoteControl.setCommand(1, kitchenOn, kitchenOff);

        System.out.println(remoteControl);

        // Action 3 : Turn the living room light on
        remoteControl.onButtonWasPushed(0);
        // Action 4 : Turn the living room light off
        remoteControl.offButtonWasPushed(0);
        // Action 5 : Turn the kitchen light on
        remoteControl.onButtonWasPushed(1);
        // Action 6 : Turn the kitchen light off
        remoteControl.offButtonWasPushed(1);

        // Macro command example
        System.out.println("---------------------------------------------------------------");
        Command[] partyOn = { livingRoomOn, kitchenOn };
        Command[] partyOff = { livingRoomOff, kitchenOff };

        MacroCommand partyOnMacro =  new MacroCommand(partyOn);
        MacroCommand partyOffMacro =  new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        // Action 7 : Turn the living room light and kitchen light on Macro
        remoteControl.onButtonWasPushed(0);
        // Action 8 : Turn the living room light and kitchen light off Macro
        remoteControl.offButtonWasPushed(0);
    }
}
