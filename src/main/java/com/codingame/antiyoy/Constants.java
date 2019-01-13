package com.codingame.antiyoy;

import java.util.regex.Pattern;

public final class Constants {
    static public final int MAP_WIDTH = 8;
    static public final int MAP_HEIGHT = 8;

    static public final int MAX_TURNS = 100;
    static public final int PLAYER_COUNT = 2;

    static public final int VOID = -2;
    static public final int NEUTRAL= -1;

    static public final int    UP = 0;
    static public final int RIGHT = 1;
    static public final int  DOWN = 2;
    static public final int  LEFT = 3;

    static public final int CELL_INCOME = 1;

    static public final int UNIT_COST[] = {0, 10, 20, 30};
    static public final int UNIT_UPKEEP[] = {0, 1, 4, 20};
    static public final int MAX_LEVEL = 3;

    public enum ACTIONTYPE {MOVE, BUILD, TRAIN};

    public enum BUILDING_TYPE {HQ, MINE, TOWER};

    public static final Pattern MOVETRAIN_PATTERN = Pattern.compile("^(MOVE|TRAIN) ([0-9]*) ([0-9]*) ([0-9]*)$");
    public static final Pattern MOVE_PATTERN = Pattern.compile("^MOVE ([0-9]*) ([0-9]*) ([0-9]*)$");
    public static final Pattern TRAIN_PATTERN = Pattern.compile("^TRAIN ([0-9]*) ([0-9]*) ([0-9]*)$");
    public  static final Pattern BUILD_PATTERN = Pattern.compile("^BUILD ([A-Z]*) ([0-9]*) ([0-9]*)$");

    private Constants() {}
}