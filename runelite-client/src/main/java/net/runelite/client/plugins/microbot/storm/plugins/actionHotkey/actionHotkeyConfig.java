package net.runelite.client.plugins.microbot.storm.plugins.actionHotkey;

import net.runelite.client.config.*;
import net.runelite.client.plugins.microbot.storm.plugins.actionHotkey.enums.*;

@ConfigGroup("actionHotkey")
@ConfigInformation("Storm's Simple action <br />" +
        "to hotkey script, more <br />" +
        "actions to be added <br />" +
        "later. useful for things <br />" +
        "like training prayer at <br />" +
        "the chaos altar, or <br />" +
        "anything else repetitive <br /> " +
        "or hard to click.")
public interface actionHotkeyConfig extends Config {
    @ConfigSection(
            name = "Options",
            description = "options",
            position = 4
    )
    String options = "Options";
    @ConfigSection(
            name = "First Action",
            description = "first action",
            position = 5,
            closedByDefault = true
    )
    String firstSection = "First Action";
    @ConfigSection(
            name = "Second Action",
            description = "second action",
            position = 6,
            closedByDefault = true
    )
    String secondSection = "Second Action";
    @ConfigSection(
            name = "First Category",
            description = "first action",
            position = 7,
            closedByDefault = true
    )
    String firstCategories = "First Category";
    @ConfigSection(
            name = "Second Category",
            description = "second category",
            position = 8,
            closedByDefault = true
    )
    String secondCategories = "Second Category";
    @ConfigSection(
            name = "debug",
            description = "debug",
            position = 9
    )
    String debug = "Debug";
    @ConfigItem(keyName = "toggle mode", name = "toggle mode", description = "Do you want a toggle instead of keydown?", position = 0, section = options)
    default boolean toggle() { return false; }
    @ConfigItem(keyName = "alternate", name = "Alternate?", description = "When holding down the key do you want to alternate the actions?", position = 1, section = options)
    default boolean alternate() { return true; }
    @ConfigItem(keyName = "key1", name = "key1", description = "what should key 1 be?", position = 1, section = options)
    default Keys key1() { return Keys.VK_ESCAPE; }
    @ConfigItem(keyName = "key2", name = "key2", description = "what should key 2 be?", position = 2, section = options)
    default Keys key2() { return Keys.VK_CONTROL; }

    @ConfigItem(keyName = "sleepMin", name = "sleepMin", description = "Minimum sleep time", position = 3, section = options)
    @Range( min = 60, max = 30000 )
    default int sleepMin() { return 60; }
    @ConfigItem(keyName = "sleepMax", name = "sleepMax", description = "Maximum sleep time", position = 4, section = options)
    @Range( min = 90, max = 30000 )
    default int sleepMax() { return 160; }

    @ConfigItem(keyName = "firstCategory", name = "Action Category", description = "pick category for first action", position = 0, section = firstSection)
    default Categories firstCategoryName() { return Categories.RS2BANK; }
    @ConfigItem(keyName = "firstActionIDEntry", name = "ID provided to action?", description = "what ID to send to action?", position = 1, section = firstSection)
    default String firstActionIDEntry() { return "0"; }
    @ConfigItem(keyName = "firstActionMenu", name = "menu of action?", description = "what action menu", position = 2, section = firstSection)
    default String firstActionMenu() { return ""; }

    @ConfigItem(keyName = "secondActionName", name = "name of action?", description = "what action to use", position = 0, section = secondSection)
    default Categories secondCategoryName() { return Categories.RS2BANK; }
    @ConfigItem(keyName = "secondActionIDEntry", name = "ID provided to action?", description = "what ID to send to action?", position = 1, section = secondSection)
    default String secondActionIDEntry() { return "0"; }
    @ConfigItem(keyName = "secondActionMenu", name = "menu of action?", description = "what action menu", position = 2, section = secondSection)
    default String secondActionMenu() { return ""; }

    @ConfigItem(keyName = "firstRs2Bank", name = "Rs2Bank Action", description = "pick action for Rs2Bank", position = 0, section = firstCategories)
    default Rs2Bank firstRs2Bank() { return Rs2Bank.OPEN_BANK; }
    @ConfigItem(keyName = "firstRs2GameObject", name = "Rs2GameObject Action", description = "pick action for Rs2GameObject", position = 1, section = firstCategories)
    default Rs2GameObject firstRs2GameObject() { return Rs2GameObject.OBJ_INTERACT; }
    @ConfigItem(keyName = "firstRs2Inventory", name = "Rs2Inventory Action", description = "pick action for Rs2Inventory", position = 1, section = firstCategories)
    default Rs2Inventory firstRs2Inventory() { return Rs2Inventory.INV_INTERACT; }
    @ConfigItem(keyName = "firstRs2Npc", name = "Rs2Npc Action", description = "pick action for Rs2Npc", position = 1, section = firstCategories)
    default Rs2Npc firstRs2Npc() { return Rs2Npc.NPC_INTERACT; }
    @ConfigItem(keyName = "firstRs2Walker", name = "Rs2Walker Action", description = "pick action for Rs2Walker", position = 1, section = firstCategories)
    default Rs2Walker firstRs2Walker() { return Rs2Walker.WALK_FAST_CANVAS; }
    @ConfigItem(keyName = "firstRs2Widget", name = "Rs2Widget Action", description = "pick action for Rs2Widget", position = 1, section = firstCategories)
    default Rs2Widget firstRs2Widget() { return Rs2Widget.GET_WIDGET; }
    @ConfigItem(keyName = "firstOther", name = "Other Action", description = "pick action for Other", position = 1, section = firstCategories)
    default Other firstOther() { return Other.PRINTLN; }

    @ConfigItem(keyName = "secondRs2Bank", name = "Rs2Bank Action", description = "pick action for Rs2Bank", position = 0, section = secondCategories)
    default Rs2Bank secondRs2Bank() { return Rs2Bank.OPEN_BANK; }
    @ConfigItem(keyName = "secondRs2GameObject", name = "Rs2GameObject Action", description = "pick action for Rs2GameObject", position = 1, section = secondCategories)
    default Rs2GameObject secondRs2GameObject() { return Rs2GameObject.OBJ_INTERACT; }
    @ConfigItem(keyName = "secondRs2Inventory", name = "Rs2Inventory Action", description = "pick action for Rs2Inventory", position = 1, section = secondCategories)
    default Rs2Inventory secondRs2Inventory() { return Rs2Inventory.INV_INTERACT; }
    @ConfigItem(keyName = "secondRs2Npc", name = "Rs2Npc Action", description = "pick action for Rs2Npc", position = 1, section = secondCategories)
    default Rs2Npc secondRs2Npc() { return Rs2Npc.NPC_INTERACT; }
    @ConfigItem(keyName = "secondRs2Walker", name = "Rs2Walker Action", description = "pick action for Rs2Walker", position = 1, section = secondCategories)
    default Rs2Walker secondRs2Walker() { return Rs2Walker.WALK_FAST_CANVAS; }
    @ConfigItem(keyName = "secondRs2Widget", name = "Rs2Widget Action", description = "pick action for Rs2Widget", position = 1, section = secondCategories)
    default Rs2Widget secondRs2Widget() { return Rs2Widget.GET_WIDGET; }
    @ConfigItem(keyName = "secondOther", name = "Other Action", description = "pick action for Other", position = 1, section = secondCategories)
    default Other secondOther() { return Other.PRINTLN; }

    @ConfigItem(keyName = "doAction", name = "Do Action?", description = "do you want this action done?", position = 0, section = debug)
    default boolean doAction() { return true; }
}
