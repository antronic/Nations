package com.arckenver.nations;

import java.io.File;
import java.io.IOException;

import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;

public class LanguageHandler
{
	public static String AA;
	public static String AB;
	public static String AC;
	public static String AD;
	public static String AE;
	public static String AF;
	public static String AG;
	public static String AH;
	public static String AI;
	public static String AJ;
	public static String AK;
	public static String AL;
	public static String AM;
	public static String AN;
	public static String AO;
	public static String AP;
	public static String AQ;
	public static String AR;
	public static String AS;
	public static String AT;
	public static String AU;
	public static String BA;
	public static String BB;
	public static String BC;
	public static String BD;
	public static String BE;
	public static String BF;
	public static String BG;
	public static String BH;
	public static String BI;
	public static String BJ;
	public static String BK;
	public static String BL;
	public static String BM;
	public static String BN;
	public static String BO;
	public static String BP;
	public static String BQ;
	public static String BR;
	public static String BS;
	public static String BT;
	public static String BU;
	public static String BV;
	public static String BW;
	public static String BX;
	public static String BY;
	public static String BZ;
	public static String CA;
	public static String CB;
	public static String CC;
	public static String CD;
	public static String CE;
	public static String CF;
	public static String CG;
	public static String CH;
	public static String CI;
	public static String CJ;
	public static String CK;
	public static String CL;
	public static String CM;
	public static String CN;
	public static String CO;
	public static String CP;
	public static String CQ;
	public static String CR;
	public static String CS;
	public static String CT;
	public static String CU;
	public static String CV;
	public static String CW;
	public static String CX;
	public static String DA;
	public static String DB;
	public static String DC;
	public static String DD;
	public static String DE;
	public static String DF;
	public static String DG;
	public static String DH;
	public static String DI;
	public static String DJ;
	public static String DK;
	public static String DL;
	public static String DM;
	public static String DN;
	public static String DO;
	public static String DP;
	public static String EA;
	public static String EB;
	public static String EC;
	public static String ED;
	public static String EF;
	public static String EG;
	public static String EH;
	public static String EI;
	public static String EJ;
	public static String EK;
	public static String EL;
	public static String EM;
	public static String EN;
	public static String EO;
	public static String EP;
	public static String EQ;
	public static String ER;
	public static String ES;
	public static String ET;
	public static String EU;
	public static String EV;
	public static String EW;
	public static String EX;
	public static String EY;
	public static String EZ;
	public static String FA;
	public static String FB;
	public static String FC;
	public static String FD;
	public static String FE;
	public static String FF;
	public static String FG;
	public static String FH;
	public static String FI;
	public static String FJ;
	public static String FK;
	public static String FL;
	public static String FM;
	public static String FN;
	public static String FO;
	public static String FP;
	public static String FQ;
	public static String FR;
	public static String FS;
	public static String FT;
	public static String FU;
	public static String FV;
	public static String FW;
	public static String FX;
	public static String FY;
	public static String FZ;
	public static String GA;
	public static String GB;
	public static String GC;
	public static String GD;
	public static String GE;
	public static String GF;
	public static String GG;
	public static String GH;
	public static String GI;
	public static String GJ;
	public static String GK;
	public static String GL;
	public static String GM;
	public static String GN;
	public static String GO;
	public static String GP;
	public static String GQ;
	public static String GR;
	public static String GS;
	public static String GT;
	public static String GU;
	public static String GV;
	public static String GW;
	public static String GX;
	public static String GY;
	public static String GZ;
	public static String HA;
	public static String HB;
	public static String HC;
	public static String HD;
	public static String HE;
	public static String HF;
	public static String HG;
	public static String HH;
	public static String HI;
	public static String HJ;
	public static String HK;
	public static String HL;
	public static String HM;
	public static String HN;
	public static String HO;
	public static String HP;
	public static String IA;
	public static String IB;
	public static String IC;
	public static String ID;
	public static String IE;
	public static String IF;
	public static String IG;
	public static String IH;
	public static String II;
	public static String IJ;
	public static String IK;
	public static String IL;
	public static String IM;
	public static String IN;
	public static String IO;
	public static String IP;
	public static String IQ;
	public static String IR;
	public static String IS;
	public static String IT;
	public static String IU;
	public static String JA;
	public static String JB;
	public static String JC;
	
	private static File languageFile;
	private static ConfigurationLoader<CommentedConfigurationNode> languageManager;
	private static CommentedConfigurationNode language;
	private static CommentedConfigurationNode defaultLanguage;

	public static void init(File rootDir)
	{
		languageFile = new File(rootDir, "language.conf");
		languageManager = HoconConfigurationLoader.builder().setPath(languageFile.toPath()).build();
		
		try
		{
			if (!languageFile.exists())
			{
				languageFile.getParentFile().mkdirs();
				languageFile.createNewFile();
				language = languageManager.load();
				languageManager.save(language);
			}
			language = languageManager.load();
		}
		catch (IOException e)
		{
			NationsPlugin.getLogger().error("Could not load or create language file !");
			e.printStackTrace();
		}
		
		defaultLanguage = HoconConfigurationLoader.builder().build().createEmptyNode();
		
		defaultLanguage.getNode("AA").setValue("get nation details");
		defaultLanguage.getNode("AB").setValue("get details of the nation your standing on");
		defaultLanguage.getNode("AC").setValue("get the list of all nations");
		defaultLanguage.getNode("AD").setValue("create a new nation");
		defaultLanguage.getNode("AE").setValue("deposit money in your nation bank");
		defaultLanguage.getNode("AF").setValue("withdraw money from your nation bank");
		defaultLanguage.getNode("AG").setValue("claim the area you've selected");
		defaultLanguage.getNode("AH").setValue("unclaim the area you've selected");
		defaultLanguage.getNode("AI").setValue("invite player in your nation");
		defaultLanguage.getNode("AJ").setValue("ask nation staff to let you in the nation");
		defaultLanguage.getNode("AK").setValue("kick player out of your nation");
		defaultLanguage.getNode("AL").setValue("leave your nation");
		defaultLanguage.getNode("AM").setValue("resign as the nation president");
		defaultLanguage.getNode("AN").setValue("manage ministers");
		defaultLanguage.getNode("AO").setValue("set nation perm");
		defaultLanguage.getNode("AP").setValue("set nation flag");
		defaultLanguage.getNode("AQ").setValue("teleport to spawn with the given name");
		defaultLanguage.getNode("AR").setValue("set spawn with the given name");
		defaultLanguage.getNode("AS").setValue("delete spawn with the given name");
		defaultLanguage.getNode("AT").setValue("buy extra claimable blocks");
		defaultLanguage.getNode("AU").setValue("get player details");
		
		defaultLanguage.getNode("BA").setValue("get zone details");
		defaultLanguage.getNode("BB").setValue("get details of the zone your standing on");
		defaultLanguage.getNode("BC").setValue("create a new zone");
		defaultLanguage.getNode("BD").setValue("manage coowners");
		defaultLanguage.getNode("BE").setValue("set zone owner");
		defaultLanguage.getNode("BF").setValue("make this zone owner free");
		defaultLanguage.getNode("BG").setValue("set zone perm");
		defaultLanguage.getNode("BH").setValue("set zone flag");
		defaultLanguage.getNode("BI").setValue("put zone up for sale");
		defaultLanguage.getNode("BJ").setValue("buy the zone your standing on");
		defaultLanguage.getNode("BK").setValue("delete specified zone (or standing on)");

		defaultLanguage.getNode("BL").setValue("create admin nation");
		defaultLanguage.getNode("BM").setValue("delete given nation");
		defaultLanguage.getNode("BN").setValue("set nation's name");
		defaultLanguage.getNode("BO").setValue("set nation's president");
		defaultLanguage.getNode("BP").setValue("make player join nation");
		defaultLanguage.getNode("BQ").setValue("make player leave nation");
		defaultLanguage.getNode("BR").setValue("manage money");
		defaultLanguage.getNode("BS").setValue("set nation perm");
		defaultLanguage.getNode("BT").setValue("set nation flag");
		
		defaultLanguage.getNode("BU").setValue("get world details");
		defaultLanguage.getNode("BV").setValue("get the list of all worlds");
		defaultLanguage.getNode("BW").setValue("enable nations in specified world");
		defaultLanguage.getNode("BX").setValue("disable nation in specified world");
		defaultLanguage.getNode("BY").setValue("set world perm");
		defaultLanguage.getNode("BZ").setValue("set world flag");

		defaultLanguage.getNode("CA").setValue("You must be an in-game player to perform that command");
		defaultLanguage.getNode("CB").setValue("Invalid nation name");
		defaultLanguage.getNode("CC").setValue("Invalid player name");
		defaultLanguage.getNode("CD").setValue("Invalid argument, you must use \"add\" or \"remove\"");
		defaultLanguage.getNode("CE").setValue("Invalid successor name");
		defaultLanguage.getNode("CF").setValue("Invalid zone name");
		defaultLanguage.getNode("CG").setValue("You must specify nation name");
		defaultLanguage.getNode("CH").setValue("You must specify player name");
		defaultLanguage.getNode("CI").setValue("You must be in a nation to perform that command");
		defaultLanguage.getNode("CJ").setValue("You must be president of your nation to perform that command");
		defaultLanguage.getNode("CK").setValue("You must be president or minister of your nation to perform that command");
		defaultLanguage.getNode("CL").setValue("A new day is here ! Nations will now have to pay their upkeeps");
		defaultLanguage.getNode("CM").setValue("Nation {NATION} could not pay its upkeep and fell into ruins");
		defaultLanguage.getNode("CN").setValue("Nation {NATION} fell into ruins !");
		defaultLanguage.getNode("CO").setValue("There is no nation created yet");
		defaultLanguage.getNode("CP").setValue("You don't have permission to list all zones of that nation");
		defaultLanguage.getNode("CQ").setValue("That player is already president");
		defaultLanguage.getNode("CR").setValue("That player is not part of the nation");
		defaultLanguage.getNode("CS").setValue("Nations plugin is disabled for this world");
		defaultLanguage.getNode("CT").setValue("Invalid world name");
		defaultLanguage.getNode("CU").setValue("You must specify world name");
		defaultLanguage.getNode("CV").setValue("Nations plugin is already enabled for this world");
		defaultLanguage.getNode("CW").setValue("Nations plugin is already disabled for this world");
		defaultLanguage.getNode("CX").setValue("Invalid operation, use \"give\", \"take\" or \"set\"");

		defaultLanguage.getNode("DA").setValue("Price must be a positive or null value");
		defaultLanguage.getNode("DB").setValue("Your nation can't buy more than {NUM} extra blocks");
		defaultLanguage.getNode("DC").setValue("There is no economy plugin on this server");
		defaultLanguage.getNode("DD").setValue("Could not get the nation's account on the economy plugin of this server");
		defaultLanguage.getNode("DE").setValue("You need {AMOUNT} to perform that transaction");
		defaultLanguage.getNode("DF").setValue("Your nation needs {AMOUNT} to perform that transaction");
		defaultLanguage.getNode("DG").setValue("Successfully bought {NUM} extra blocks for {AMOUNT}");
		defaultLanguage.getNode("DH").setValue("You don't have that much money");
		defaultLanguage.getNode("DI").setValue("Your nation doesn't have that much money");
		defaultLanguage.getNode("DJ").setValue("Your nation was refunded {AMOUNT} for unclaiming these {NUM} blocks ({PRECENT}%)");
		defaultLanguage.getNode("DK").setValue("You successfully unclaimed this area");
		defaultLanguage.getNode("DL").setValue("You successfully took {AMOUNT} from your nation that has now {BALANCE}");
		defaultLanguage.getNode("DM").setValue("{PLAYER} put zone {ZONE} up for sale at {AMOUNT}");
		defaultLanguage.getNode("DN").setValue("An unexpected error has occured while processing transaction");
		defaultLanguage.getNode("DO").setValue("Could not get your account on the economy plugin of this server");
		defaultLanguage.getNode("DP").setValue("Could not get zone owner's account on the economy plugin of this server");
		
		defaultLanguage.getNode("EA").setValue("You must select a region with a golden axe first (right/left click)");
		defaultLanguage.getNode("EB").setValue("Your selection must be adjacent to your region");
		defaultLanguage.getNode("EC").setValue("Your selection must intersect your region");
		defaultLanguage.getNode("ED").setValue("Your selection must be included into nation's region");
		defaultLanguage.getNode("EF").setValue("Your selection contains a spawn of your nation");
		defaultLanguage.getNode("EG").setValue("Your nation don't have enough blocks, you can buy extra ones with /n buyextra");
		defaultLanguage.getNode("EH").setValue("You successfully claimed this area");
		defaultLanguage.getNode("EI").setValue("Too close to another nation");
		defaultLanguage.getNode("EJ").setValue("You successfully created an outpost here");
		defaultLanguage.getNode("EK").setValue("You must leave your nation to perform that command");
		defaultLanguage.getNode("EL").setValue("That name is already taken");
		defaultLanguage.getNode("EM").setValue("Nation name must be alphanumeric");
		defaultLanguage.getNode("EN").setValue("Nation name must contain at least {MIN} and at most {MAX} characters");
		defaultLanguage.getNode("EO").setValue("Could not create nation's account, please contact a server administrator");
		defaultLanguage.getNode("EP").setValue("{PLAYER} has created a new nation named {NATION}");
		defaultLanguage.getNode("EQ").setValue("You successfully created nation {NATION}, don't forget to deposit money in the nation's bank with /n deposit");
		defaultLanguage.getNode("ER").setValue("Click to delete spawn {SPAWNLIST} ");
		defaultLanguage.getNode("ES").setValue("Your nation doen't have any spawn with that name");
		defaultLanguage.getNode("ET").setValue("Successfully removed nation spawn");
		defaultLanguage.getNode("EU").setValue("You've successfully given {AMOUNT} to your nation that has now {BALANCE}");
		defaultLanguage.getNode("EV").setValue("You are not standing on any nation's region");
		defaultLanguage.getNode("EW").setValue("That player is already in your nation");
		defaultLanguage.getNode("EX").setValue("Your nation already invited this citizen");
		defaultLanguage.getNode("EY").setValue("{PLAYER} joined the nation");
		defaultLanguage.getNode("EZ").setValue("You joined nation {NATION}");
		defaultLanguage.getNode("FA").setValue("You were invited to join nation {NATION}, {CLICKHERE} to accept invitation");
		defaultLanguage.getNode("FB").setValue("Request was send to {RECEIVER}");
		defaultLanguage.getNode("FC").setValue("You already asked that nation");
		defaultLanguage.getNode("FD").setValue("There are no players in the nation's staff connected yet");
		defaultLanguage.getNode("FE").setValue("{PLAYER} wants to join your nation, {CLICKHERE} to accept demand");
		defaultLanguage.getNode("FF").setValue("That player is not in your nation");
		defaultLanguage.getNode("FG").setValue("You can't kick yourself out of your nation, use /n leave to quit the nation");
		defaultLanguage.getNode("FH").setValue("You can't kick the president out of your nation");
		defaultLanguage.getNode("FI").setValue("You can't kick a fellow minister out of your nation");
		defaultLanguage.getNode("FJ").setValue("{PLAYER} was kicked out of your nation");
		defaultLanguage.getNode("FK").setValue("You were kicked out of your nation by {PLAYER}");
		defaultLanguage.getNode("FL").setValue("You must first resign as president before you leave the nation, use /n resign");
		defaultLanguage.getNode("FM").setValue("You left your nation");
		defaultLanguage.getNode("FN").setValue("{PLAYER} left the nation");
		defaultLanguage.getNode("FO").setValue("You can't add/remove yourself from the ministers of your nation");
		defaultLanguage.getNode("FP").setValue("{PLAYER} is already minister of your nation");
		defaultLanguage.getNode("FQ").setValue("{PLAYER} was successfully added to the ministers of your nation");
		defaultLanguage.getNode("FR").setValue("{PLAYER} added you to the ministers of your nation");
		defaultLanguage.getNode("FS").setValue("{PLAYER} is already not minister of your nation");
		defaultLanguage.getNode("FT").setValue("{PLAYER} was successfully removed from the ministers of your nation");
		defaultLanguage.getNode("FU").setValue("{PLAYER} removed you from the ministers of your nation");
		defaultLanguage.getNode("FV").setValue("{SUCCESSOR} replaces now {PLAYER} as nation's president");
		defaultLanguage.getNode("FW").setValue("Nation {OLDNAME} changed its name to {NEWNAME}");
		defaultLanguage.getNode("FX").setValue("Nation spawn must be set inside your territory");
		defaultLanguage.getNode("FY").setValue("Spawn name must be alphanumeric and must contain between {MIN} and {MAX} characters");
		defaultLanguage.getNode("FZ").setValue("Successfully changed the nation spawn");
		defaultLanguage.getNode("GA").setValue("You can teleport to {SPAWNLIST} ");
		defaultLanguage.getNode("GB").setValue("Invalid spawn name, choose between {SPAWNLIST} ");
		defaultLanguage.getNode("GC").setValue("Teleported you to the nation spawn");
		defaultLanguage.getNode("GD").setValue("You must be standing on a zone to perform that command");
		defaultLanguage.getNode("GE").setValue("This zone is not up for sale");
		defaultLanguage.getNode("GF").setValue("You need {AMOUNT} to pay for this zone");
		defaultLanguage.getNode("GG").setValue("You are now the new owner of zone {ZONE}");
		defaultLanguage.getNode("GH").setValue("{PLAYER} bought you zone {ZONE} for {AMOUNT}");
		defaultLanguage.getNode("GI").setValue("You're not standing on any zone of your nation");
		defaultLanguage.getNode("GJ").setValue("You must be owner of that zone to perform that command");
		defaultLanguage.getNode("GK").setValue("You can't add/remove yourself from the coowners of your zone");
		defaultLanguage.getNode("GL").setValue("{PLAYER} is already coowner of your zone");
		defaultLanguage.getNode("GM").setValue("{PLAYER} was successfully added to the coowners of your zone");
		defaultLanguage.getNode("GN").setValue("{PLAYER} added you to the coowners of zone {ZONE}");
		defaultLanguage.getNode("GO").setValue("{PLAYER} is already not coowner of your zone");
		defaultLanguage.getNode("GP").setValue("{PLAYER} was successfully removed from the coowners of your zone");
		defaultLanguage.getNode("GQ").setValue("{PLAYER} removed you from the coowners of zone {ZONE}");
		defaultLanguage.getNode("GR").setValue("There already is a zone with that name in your nation");
		defaultLanguage.getNode("GS").setValue("There is a zone that instersects with your selection");
		defaultLanguage.getNode("GT").setValue("You have successfully created a zone named {ZONE}");
		defaultLanguage.getNode("GU").setValue("You are now the owner of zone {ZONE} inside of your nation");
		defaultLanguage.getNode("GV").setValue("You must own this zone to perform that command");
		defaultLanguage.getNode("GW").setValue("Zone {ZONE} has now no owner");
		defaultLanguage.getNode("GX").setValue("You must be standing on your zone to perform that command");
		defaultLanguage.getNode("GY").setValue("You must own this zone to perform that command");
		defaultLanguage.getNode("GZ").setValue("You must specify zone name or stand on it");
		defaultLanguage.getNode("HA").setValue("{NATION}'s zones are {ZONE}");
		defaultLanguage.getNode("HB").setValue("You can't set yourself as the new owner");
		defaultLanguage.getNode("HC").setValue("New owner must be part of your nation");
		defaultLanguage.getNode("HD").setValue("{PLAYER} is now the new owner of zone {ZONE}");
		defaultLanguage.getNode("HE").setValue("{PLAYER} set you as the owner of zone {ZONE}");
		defaultLanguage.getNode("HF").setValue("Your selection contains a zone of your nation");
		defaultLanguage.getNode("HG").setValue("Selected zone is not inside your nation's region");
		defaultLanguage.getNode("HH").setValue("You don't have permission to build here");
		defaultLanguage.getNode("HI").setValue("You don't have permission to interact here");
		defaultLanguage.getNode("HJ").setValue("Player is not part of a nation");
		defaultLanguage.getNode("HK").setValue("Player is president of his nation, use /na setpres");
		defaultLanguage.getNode("HL").setValue("Success !");
		defaultLanguage.getNode("HM").setValue("You've successfully deleted zone {ZONE} in your nation");
		defaultLanguage.getNode("HN").setValue("Taxes editing is disabled");
		defaultLanguage.getNode("HO").setValue("Taxes can't be higher than {AMOUNT}");
		defaultLanguage.getNode("HP").setValue("You successfully changed your nation's taxes");

		defaultLanguage.getNode("IA").setValue("Wilderness");
		defaultLanguage.getNode("IB").setValue("Nation");
		defaultLanguage.getNode("IC").setValue("Zone");
		defaultLanguage.getNode("ID").setValue("Size");
		defaultLanguage.getNode("IE").setValue("Money");
		defaultLanguage.getNode("IF").setValue("Price");
		defaultLanguage.getNode("IG").setValue("Spawn");
		defaultLanguage.getNode("IH").setValue("President");
		defaultLanguage.getNode("II").setValue("Ministers");
		defaultLanguage.getNode("IJ").setValue("Citizens");
		defaultLanguage.getNode("IK").setValue("Permissions");
		defaultLanguage.getNode("IL").setValue("Outsiders");
		defaultLanguage.getNode("IM").setValue("Flags");
		defaultLanguage.getNode("IN").setValue("Owner");
		defaultLanguage.getNode("IO").setValue("Coowners");
		defaultLanguage.getNode("IP").setValue("None");
		defaultLanguage.getNode("IQ").setValue("Unknown");
		defaultLanguage.getNode("IR").setValue("Not for sale");
		defaultLanguage.getNode("IS").setValue("Player");
		defaultLanguage.getNode("IT").setValue("ENABLED");
		defaultLanguage.getNode("IU").setValue("DISABLED");
		
		defaultLanguage.getNode("JA").setValue("click here");
		defaultLanguage.getNode("JB").setValue("Nation List");
		defaultLanguage.getNode("JC").setValue("World List");
	}
	
	public static void load()
	{
		AA = getOrDefault("AA");
		AB = getOrDefault("AB");
		AC = getOrDefault("AC");
		AD = getOrDefault("AD");
		AE = getOrDefault("AE");
		AF = getOrDefault("AF");
		AG = getOrDefault("AG");
		AH = getOrDefault("AH");
		AI = getOrDefault("AI");
		AJ = getOrDefault("AJ");
		AK = getOrDefault("AK");
		AL = getOrDefault("AL");
		AM = getOrDefault("AM");
		AN = getOrDefault("AN");
		AO = getOrDefault("AO");
		AP = getOrDefault("AP");
		AQ = getOrDefault("AQ");
		AR = getOrDefault("AR");
		AS = getOrDefault("AS");
		AT = getOrDefault("AT");
		AU = getOrDefault("AU");
		BA = getOrDefault("BA");
		BB = getOrDefault("BB");
		BC = getOrDefault("BC");
		BD = getOrDefault("BD");
		BE = getOrDefault("BE");
		BF = getOrDefault("BF");
		BG = getOrDefault("BG");
		BH = getOrDefault("BH");
		BI = getOrDefault("BI");
		BJ = getOrDefault("BJ");
		BK = getOrDefault("BK");
		BL = getOrDefault("BL");
		BM = getOrDefault("BM");
		BN = getOrDefault("BN");
		BO = getOrDefault("BO");
		BP = getOrDefault("BP");
		BQ = getOrDefault("BQ");
		BR = getOrDefault("BR");
		BS = getOrDefault("BS");
		BT = getOrDefault("BT");
		BU = getOrDefault("BU");
		BV = getOrDefault("BV");
		BW = getOrDefault("BW");
		BX = getOrDefault("BX");
		BY = getOrDefault("BY");
		BZ = getOrDefault("BZ");
		CA = getOrDefault("CA");
		CB = getOrDefault("CB");
		CC = getOrDefault("CC");
		CD = getOrDefault("CD");
		CE = getOrDefault("CE");
		CF = getOrDefault("CF");
		CG = getOrDefault("CG");
		CH = getOrDefault("CH");
		CI = getOrDefault("CI");
		CJ = getOrDefault("CJ");
		CK = getOrDefault("CK");
		CL = getOrDefault("CL");
		CM = getOrDefault("CM");
		CN = getOrDefault("CN");
		CO = getOrDefault("CO");
		CP = getOrDefault("CP");
		CQ = getOrDefault("CQ");
		CR = getOrDefault("CR");
		CS = getOrDefault("CS");
		CT = getOrDefault("CT");
		CU = getOrDefault("CU");
		CV = getOrDefault("CV");
		CW = getOrDefault("CW");
		CX = getOrDefault("CX");
		DA = getOrDefault("DA");
		DB = getOrDefault("DB");
		DC = getOrDefault("DC");
		DD = getOrDefault("DD");
		DE = getOrDefault("DE");
		DF = getOrDefault("DF");
		DG = getOrDefault("DG");
		DH = getOrDefault("DH");
		DI = getOrDefault("DI");
		DJ = getOrDefault("DJ");
		DK = getOrDefault("DK");
		DL = getOrDefault("DL");
		DM = getOrDefault("DM");
		DN = getOrDefault("DN");
		DO = getOrDefault("DO");
		DP = getOrDefault("DP");
		EA = getOrDefault("EA");
		EB = getOrDefault("EB");
		EC = getOrDefault("EC");
		ED = getOrDefault("ED");
		EF = getOrDefault("EF");
		EG = getOrDefault("EG");
		EH = getOrDefault("EH");
		EI = getOrDefault("EI");
		EJ = getOrDefault("EJ");
		EK = getOrDefault("EK");
		EL = getOrDefault("EL");
		EM = getOrDefault("EM");
		EN = getOrDefault("EN");
		EO = getOrDefault("EO");
		EP = getOrDefault("EP");
		EQ = getOrDefault("EQ");
		ER = getOrDefault("ER");
		ES = getOrDefault("ES");
		ET = getOrDefault("ET");
		EU = getOrDefault("EU");
		EV = getOrDefault("EV");
		EW = getOrDefault("EW");
		EX = getOrDefault("EX");
		EY = getOrDefault("EY");
		EZ = getOrDefault("EZ");
		FA = getOrDefault("FA");
		FB = getOrDefault("FB");
		FC = getOrDefault("FC");
		FD = getOrDefault("FD");
		FE = getOrDefault("FE");
		FF = getOrDefault("FF");
		FG = getOrDefault("FG");
		FH = getOrDefault("FH");
		FI = getOrDefault("FI");
		FJ = getOrDefault("FJ");
		FK = getOrDefault("FK");
		FL = getOrDefault("FL");
		FM = getOrDefault("FM");
		FN = getOrDefault("FN");
		FO = getOrDefault("FO");
		FP = getOrDefault("FP");
		FQ = getOrDefault("FQ");
		FR = getOrDefault("FR");
		FS = getOrDefault("FS");
		FT = getOrDefault("FT");
		FU = getOrDefault("FU");
		FV = getOrDefault("FV");
		FW = getOrDefault("FW");
		FX = getOrDefault("FX");
		FY = getOrDefault("FY");
		FZ = getOrDefault("FZ");
		GA = getOrDefault("GA");
		GB = getOrDefault("GB");
		GC = getOrDefault("GC");
		GD = getOrDefault("GD");
		GE = getOrDefault("GE");
		GF = getOrDefault("GF");
		GG = getOrDefault("GG");
		GH = getOrDefault("GH");
		GI = getOrDefault("GI");
		GJ = getOrDefault("GJ");
		GK = getOrDefault("GK");
		GL = getOrDefault("GL");
		GM = getOrDefault("GM");
		GN = getOrDefault("GN");
		GO = getOrDefault("GO");
		GP = getOrDefault("GP");
		GQ = getOrDefault("GQ");
		GR = getOrDefault("GR");
		GS = getOrDefault("GS");
		GT = getOrDefault("GT");
		GU = getOrDefault("GU");
		GV = getOrDefault("GV");
		GW = getOrDefault("GW");
		GX = getOrDefault("GX");
		GY = getOrDefault("GY");
		GZ = getOrDefault("GZ");
		HA = getOrDefault("HA");
		HB = getOrDefault("HB");
		HC = getOrDefault("HC");
		HD = getOrDefault("HD");
		HE = getOrDefault("HE");
		HF = getOrDefault("HF");
		HG = getOrDefault("HG");
		HH = getOrDefault("HH");
		HI = getOrDefault("HI");
		HJ = getOrDefault("HJ");
		HK = getOrDefault("HK");
		HL = getOrDefault("HL");
		HM = getOrDefault("HM");
		HN = getOrDefault("HN");
		HO = getOrDefault("HO");
		HP = getOrDefault("HP");
		IA = getOrDefault("IA");
		IB = getOrDefault("IB");
		IC = getOrDefault("IC");
		ID = getOrDefault("ID");
		IE = getOrDefault("IE");
		IF = getOrDefault("IF");
		IG = getOrDefault("IG");
		IH = getOrDefault("IH");
		II = getOrDefault("II");
		IJ = getOrDefault("IJ");
		IK = getOrDefault("IK");
		IL = getOrDefault("IL");
		IM = getOrDefault("IM");
		IN = getOrDefault("IN");
		IO = getOrDefault("IO");
		IP = getOrDefault("IP");
		IQ = getOrDefault("IQ");
		IR = getOrDefault("IR");
		IS = getOrDefault("IS");
		IT = getOrDefault("IT");
		IU = getOrDefault("IU");
		JA = getOrDefault("JA");
		JB = getOrDefault("JB");
		JC = getOrDefault("JC");
		
		save();
	}
	
	private static String getOrDefault(String key)
	{
		String str = language.getNode(key).getString();
		if (str == null)
		{
			str = defaultLanguage.getNode(key).getString();
			language.getNode(key).setValue(str);
		}
		return str;
	}

	public static void save()
	{
		try
		{
			languageManager.save(language);
		}
		catch (IOException e)
		{
			NationsPlugin.getLogger().error("Could not save config file !");
		}
	}
}
