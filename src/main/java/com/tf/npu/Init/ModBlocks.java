package com.tf.npu.Init;

import com.tf.npu.Blocks.BBed.*;
import com.tf.npu.Blocks.XingCao.*;
import com.tf.npu.Blocks.Bikes.Bike1;
import com.tf.npu.Blocks.Bikes.Bike2;
import com.tf.npu.Blocks.Bikes.Bike3;
import com.tf.npu.Blocks.Bikes.Bike4;
import com.tf.npu.Blocks.Camera.Cam1;
import com.tf.npu.Blocks.Camera.Cam2;
import com.tf.npu.Blocks.Ceiling.*;
import com.tf.npu.Blocks.Constructions.*;
import com.tf.npu.Blocks.DHalls.*;
import com.tf.npu.Blocks.Decorations.*;
import com.tf.npu.Blocks.Decs.Dec1;
import com.tf.npu.Blocks.Decs.Dec2;
import com.tf.npu.Blocks.Decs.Dec3;
import com.tf.npu.Blocks.Decs.Dec4;
import com.tf.npu.Blocks.Desks.Blue.*;
import com.tf.npu.Blocks.Desks.Wood.*;
import com.tf.npu.Blocks.Doors.*;
import com.tf.npu.Blocks.Doors.Black.*;
import com.tf.npu.Blocks.Doors.White.*;
import com.tf.npu.Blocks.Drinks.*;
import com.tf.npu.Blocks.Fence.*;
import com.tf.npu.Blocks.Floors.*;
import com.tf.npu.Blocks.FlowerDid.Day221.*;
import com.tf.npu.Blocks.FlowerDid.Day222.*;
import com.tf.npu.Blocks.FlowerDid.Day228.*;
import com.tf.npu.Blocks.FlowerDid.Day310.*;
import com.tf.npu.Blocks.FlowerDid.Day312.*;
import com.tf.npu.Blocks.FlowerDid.Others.*;
import com.tf.npu.Blocks.G.*;
import com.tf.npu.Blocks.Girl.*;
import com.tf.npu.Blocks.Guns.Gun;
import com.tf.npu.Blocks.Guns.Gun1;
import com.tf.npu.Blocks.HandRail.*;
import com.tf.npu.Blocks.Lights.*;
import com.tf.npu.Blocks.Market.*;
import com.tf.npu.Blocks.Others.*;
import com.tf.npu.Blocks.Paintings.Painting;
import com.tf.npu.Blocks.Paintings.Painting1;
import com.tf.npu.Blocks.Paintings.Painting2;
import com.tf.npu.Blocks.Paintings.Painting3;
import com.tf.npu.Blocks.Pipe.*;
import com.tf.npu.Blocks.Plants.Plant;
import com.tf.npu.Blocks.Plants.Plant1;
import com.tf.npu.Blocks.Plants.Plant2;
import com.tf.npu.Blocks.Platform.*;
import com.tf.npu.Blocks.Railings.*;
import com.tf.npu.Blocks.Road.CemH;
import com.tf.npu.Blocks.Road.CemT;
import com.tf.npu.Blocks.Signs.*;
import com.tf.npu.Blocks.Stair.*;
import com.tf.npu.Blocks.StarSignPack.*;
import com.tf.npu.Blocks.StreetLamp.SL1;
import com.tf.npu.Blocks.StreetLamp.SL2;
import com.tf.npu.Blocks.StreetLamp.SL3;
import com.tf.npu.Blocks.Trashs.*;
import com.tf.npu.Blocks.Trees.*;
import com.tf.npu.Blocks.WGWall.*;
import com.tf.npu.Blocks.Walls.*;
import com.tf.npu.Blocks.Washes.Wash1;
import com.tf.npu.Blocks.Washes.Wash2;
import com.tf.npu.Blocks.Washes.Wash3;
import com.tf.npu.Blocks.Washes.Washer;
import com.tf.npu.Blocks.Windows.Black.*;
import com.tf.npu.Blocks.Windows.Blue.*;
import com.tf.npu.Blocks.Windows.Normal.*;
import com.tf.npu.Blocks.Windows.White.Winw1;
import com.tf.npu.Blocks.Windows.White.Winw2;
import com.tf.npu.Blocks.Windows.White.Winw3;
import com.tf.npu.Blocks.YF.*;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final Block OBSIDIANBLOCK = new ObsidianBlock();
    public static final Block OBSIDIANFRAME = new ObsidianFrame();
    public static final Block CHAIR = new Chair();
    public static final Block CHAIR1 = new Chair1();
    public static final Block CHAIR2 = new Chair2();
    public static final Block Furnace = new Furnace();
    public static final Block Shop = new Shop();
    public static final Block Shop1 = new Shop1();
    public static final Block Shop2 = new Shop2();
    public static final Block Radiator = new Radiator();
    public static final Block StraightAheadSign = new StraightAheadSign().setLightLevel(0.1F);
    public static final Block PRINTER = new Printer();
    public static final Block GBED = new GBed().setLightLevel(0.1F);
    public static final Block BBEDL = new BBedL().setLightLevel(0.1F);
    public static final Block BBEDR = new BBedR().setLightLevel(0.1F);
    public static final Block BBED2L = new BBed2L().setLightLevel(0.1F);
    public static final Block BBED2R = new BBed2R().setLightLevel(0.1F);
    public static final Block BBED2R1 = new BBed2R1().setLightLevel(0.1F);
    public static final Block WINDOWFRAME = new WindowFrame();
    public static final Block CP = new CP().setLightLevel(0.1F);
    public static final Block EXIT = new Exit();
    public static final Block ELAMP = new ELamp();
    public static final Block BPDOWN = new BPDown().setLightLevel(0.1F);
    public static final Block BPUP = new BPUp();
    public static final Block SDFRAME = new SDFrame();
    public static final Block WINDOWOUT = new WindowOut();
    public static final Block BFRAME = new BFrame();
    public static final Block BFRAME1 = new BFrame1();
    public static final Block BFRAME2 = new BFrame2();
    public static final Block BRAILING = new BRailing().setLightLevel(0.1F);
    public static final Block TESTBLOCK = new TestBlock();
    public static final Block AIRCONOUT = new AirConOut().setLightLevel(0.1F);
    public static final Block AIRCONOUT1 = new AirConOut1().setLightLevel(0.1F);
    public static final Block AIRCONOUT2 = new AirConOut2().setLightLevel(0.1F);
    public static final Block AIRCONIN = new AirConIn().setLightLevel(0.1F);

    public static final Block TRASH = new Trash().setLightLevel(0.1F);
    public static final Block TRASH1 = new Trash1().setLightLevel(0.1F);
    public static final Block TRASH2 = new Trash2().setLightLevel(0.1F);
    public static final Block TRASH3 = new Trash3().setLightLevel(0.1F);
    public static final Block TRASH4 = new Trash4().setLightLevel(0.1F);

    public static final Block FLOOR2 = new Floor2();
    public static final Block FLOOR3 = new Floor3();
    public static final Block FLOOR4 = new Floor4();
    public static final Block FLOOR5 = new Floor5();
    public static final Block FLOOR6 = new Floor6();

    public static final Block GTABLE = new GTable().setLightLevel(0.1F);
    public static final Block TOILET = new Toilet();
    public static final Block SIGN = new Sign().setLightLevel(0.1F);
    public static final Block AC = new AC().setLightLevel(0.1F);
    public static final Block ACADD1 = new ACAdd1().setLightLevel(0.1F);
    public static final Block ACADD2 = new ACAdd2().setLightLevel(0.1F);
    public static final Block GROUND = new Ground();
    public static final Block ATLAS = new Atlas();
    public static final Block KNIGHT = new Knight();
    public static final Block WGWALL = new WGWall();
    public static final Block WGWALL1 = new WGWall1();
    public static final Block WGWALL2 = new WGWall2();
    public static final Block WGWALL3 = new WGWall3();
    public static final Block WGWALL4 = new WGWall4();

    public static final Block STAIR = new Stair();
    public static final Block STAIR1 = new Stair1();
    public static final Block STAIR2 = new Stair2();
    public static final Block STAIR3 = new Stair3();
    public static final Block STAIR4 = new Stair4();
    public static final Block STAIR5 = new Stair5();
    public static final Block STAIR6 = new Stair6();


    public static final Block RAILING = new Railing().setLightLevel(0.1F);
    public static final Block RAILING1 = new Railing1().setLightLevel(0.1F);
    public static final Block RAILING2 = new Railing2().setLightLevel(0.1F);
    public static final Block RAILING3 = new Railing3().setLightLevel(0.1F);
    public static final Block RAILING4 = new Railing4().setLightLevel(0.1F);
    public static final Block RAILING5 = new Railing5().setLightLevel(0.1F);

    public static final Block DOOR = new Door();
    public static final Block DOOR1 = new Door1();
    public static final Block DOOR2 = new Door2();
    public static final Block DOOR3 = new Door3();
    public static final Block DOOR4 = new Door4();
    public static final Block DOOR5 = new Door5();
    public static final Block DOOR6 = new Door6();
    public static final Block DOOR7 = new Door7().setLightLevel(0.1F);
    public static final Block DOOR8 = new Door8().setLightLevel(0.1F);
    public static final Block DOOR9 = new Door9();
    public static final Block DOOR10 = new Door10();

    public static final Block DB1 = new DB1().setLightLevel(0.1F);
    public static final Block DB2 = new DB2().setLightLevel(0.1F);
    public static final Block DB3 = new DB3().setLightLevel(0.1F);
    public static final Block DB4 = new DB4().setLightLevel(0.1F);
    public static final Block DB5 = new DB5().setLightLevel(0.1F);
    public static final Block DB6 = new DB6().setLightLevel(0.1F);
    public static final Block DB7 = new DB7().setLightLevel(0.1F);
    public static final Block DB8 = new DB8().setLightLevel(0.1F);

    public static final Block DW1 = new DW1().setLightLevel(0.1F);
    public static final Block DW2 = new DW2().setLightLevel(0.1F);
    public static final Block DW3 = new DW3().setLightLevel(0.1F);
    public static final Block DW4 = new DW4().setLightLevel(0.1F);
    public static final Block DW5 = new DW5().setLightLevel(0.1F);
    public static final Block DW6 = new DW6().setLightLevel(0.1F);
    public static final Block DW7 = new DW7().setLightLevel(0.1F);
    public static final Block DW8 = new DW8().setLightLevel(0.1F);
    public static final Block DW9 = new DW9().setLightLevel(0.1F);
    public static final Block DW10 = new DW10().setLightLevel(0.1F);


    public static final Block LIGHT = new Light();
    public static final Block LIGHT1 = new Light1();
    public static final Block LIGHT2 = new Light2();
    public static final Block LIGHT3 = new Light3();
    public static final Block LIGHT4 = new Light4();
    public static final Block LIGHT5 = new Light5();
    public static final Block LIGHT6 = new Light6();
    public static final Block LIGHT7 = new Light7();
    public static final Block LIGHT8 = new Light8();
    public static final Block LIGHT9 = new Light9();

    public static final Block FLIGHT1 = new FLight1();
    public static final Block FLIGHT2 = new FLight2();
    public static final Block FLIGHT3 = new FLight3();
    public static final Block FLIGHT4 = new FLight4();
    public static final Block FLIGHT5 = new FLight5();
    public static final Block FLIGHT6 = new FLight6();
    public static final Block FLIGHT7 = new FLight7();
    public static final Block FLIGHT8 = new FLight8();
    public static final Block FLIGHT9 = new FLight9();
    public static final Block FLIGHT10 = new FLight10();

    public static final Block GUN = new Gun();
    public static final Block GUN1 = new Gun1();

    public static final Block ATABLE = new ATable().setLightLevel(0.1F);

    public static final Block FOX = new Fox();

    public static final Block MP = new MP();

    public static final Block BOX = new Box();

    public static final Block WIN1 = new Win1().setLightLevel(0.1F);
    public static final Block WIN2 = new Win2().setLightLevel(0.1F);
    public static final Block WIN3 = new Win3().setLightLevel(0.1F);
    public static final Block WIN4 = new Win4().setLightLevel(0.1F);
    public static final Block WIN5 = new Win5().setLightLevel(0.1F);
    public static final Block WIN6 = new Win6().setLightLevel(0.1F);
    public static final Block WIN7 = new Win7().setLightLevel(0.1F);
    public static final Block WIN8 = new Win8().setLightLevel(0.1F);
    public static final Block WIN9 = new Win9().setLightLevel(0.1F);
    public static final Block WIN10 = new Win10().setLightLevel(0.1F);
    public static final Block WIN11 = new Win11().setLightLevel(0.1F);
    public static final Block WINN1 = new Winn1().setLightLevel(0.1F);
    public static final Block WINN2 = new Winn2().setLightLevel(0.1F);
    public static final Block WINN3 = new Winn3().setLightLevel(0.1F);
    public static final Block WINN4 = new Winn4().setLightLevel(0.1F);
    public static final Block WINN5 = new Winn5().setLightLevel(0.1F);
    public static final Block WINN6 = new Winn6().setLightLevel(0.1F);
    public static final Block WINN7 = new Winn7().setLightLevel(0.1F);
    public static final Block WINN8 = new Winn8().setLightLevel(0.1F);
    public static final Block WINN9 = new Winn9().setLightLevel(0.1F);
    public static final Block WINN10 = new Winn10().setLightLevel(0.1F);
    public static final Block WINN11 = new Winn11().setLightLevel(0.1F);
    public static final Block WINN12 = new Winn12().setLightLevel(0.1F);
    public static final Block WINN13 = new Winn13().setLightLevel(0.1F);
    public static final Block WINN14 = new Winn14().setLightLevel(0.1F);
    public static final Block WINN15 = new Winn15().setLightLevel(0.1F);
    public static final Block WINN16 = new Winn16().setLightLevel(0.1F);
    public static final Block WINN17 = new Winn17().setLightLevel(0.1F);
    public static final Block WINN18 = new Winn18().setLightLevel(0.1F);
    public static final Block WINN19 = new Winn19().setLightLevel(0.1F);
    public static final Block WINN20 = new Winn20().setLightLevel(0.1F);


    public static final Block WINNN1 = new Winnn1().setLightLevel(0.1F);
    public static final Block WINNN2 = new Winnn2().setLightLevel(0.1F);
    public static final Block WINNN3 = new Winnn3().setLightLevel(0.1F);
    public static final Block WINNN4 = new Winnn4().setLightLevel(0.1F);
    public static final Block WINNN5 = new Winnn5().setLightLevel(0.1F);
    public static final Block WINNN6 = new Winnn6().setLightLevel(0.1F);
    public static final Block WINNN7 = new Winnn7().setLightLevel(0.1F);
    public static final Block WINNN8 = new Winnn8().setLightLevel(0.1F);
    public static final Block WINNN9 = new Winnn9().setLightLevel(0.1F);
    public static final Block WINNN10 = new Winnn10().setLightLevel(0.1F);
    public static final Block WINNN11 = new Winnn11().setLightLevel(0.1F);
    public static final Block WINNN12 = new Winnn12().setLightLevel(0.1F);
    public static final Block WINNN13 = new Winnn13().setLightLevel(0.1F);
    public static final Block WINNN14 = new Winnn14().setLightLevel(0.1F);
    public static final Block WINNN15 = new Winnn15().setLightLevel(0.1F);
    public static final Block WINNN16 = new Winnn16().setLightLevel(0.1F);
    public static final Block WINNN17 = new Winnn17().setLightLevel(0.1F);
    public static final Block WINNN18 = new Winnn18().setLightLevel(0.1F);
    public static final Block WINNN19 = new Winnn19().setLightLevel(0.1F);
    public static final Block WINNN20 = new Winnn20().setLightLevel(0.1F);
    public static final Block WINNN21 = new Winnn21().setLightLevel(0.1F);
    public static final Block WINNN22 = new Winnn22().setLightLevel(0.1F);
    public static final Block WINNN23 = new Winnn23().setLightLevel(0.1F);

    public static final Block WINW1 = new Winw1().setLightLevel(0.1F);
    public static final Block WINW2 = new Winw2().setLightLevel(0.1F);
    public static final Block WINW3 = new Winw3().setLightLevel(0.1F);

    public static final Block PAINTING = new Painting();
    public static final Block PAINTING1 = new Painting1();
    public static final Block PAINTING2 = new Painting2();
    public static final Block PAINTING3 = new Painting3();

    public static final Block D1 = new D1();
    public static final Block D2 = new D2();
    public static final Block D3 = new D3();
    public static final Block D4 = new D4();
    public static final Block D5 = new D5();
    public static final Block D6 = new D6();
    public static final Block D7 = new D7();

    public static final Block G1 = new G1();
    public static final Block G2 = new G2();
    public static final Block G3 = new G3();
    public static final Block G4 = new G4();
    public static final Block G5 = new G5();
    public static final Block G6 = new G6();
    public static final Block G7 = new G7();
    public static final Block G8 = new G8();
    public static final Block G9 = new G9();
    public static final Block G10 = new G10();
    public static final Block G11 = new G11();
    public static final Block G12 = new G12();
    public static final Block G13 = new G13();
    public static final Block G14 = new G14();
    public static final Block G15 = new G15();
    public static final Block G16 = new G16();
    public static final Block G17 = new G17();
    public static final Block G18 = new G18();
    public static final Block G19 = new G19();
    public static final Block G20 = new G20();
    public static final Block G21A = new G21a();
    public static final Block G21B = new G21b();
    public static final Block G21C = new G21c();
    public static final Block G22 = new G22().setLightLevel(0.1F);
    public static final Block G23 = new G23().setLightLevel(0.1F);
    public static final Block G24 = new G24();
    public static final Block G25 = new G25();
    public static final Block G26 = new G26();
    public static final Block G27 = new G27();
    public static final Block G28 = new G28();
    public static final Block G29 = new G29();
    public static final Block G30 = new G30();
    public static final Block G31 = new G31();
    public static final Block G32 = new G32();
    public static final Block G33 = new G33();
    public static final Block G34 = new G34();
    public static final Block G35 = new G35();
    public static final Block G36 = new G36();
    public static final Block G37 = new G37();
    public static final Block G38 = new G38();
    public static final Block G39 = new G39();
    public static final Block G40 = new G40();
    public static final Block G41 = new G41();
    public static final Block G42 = new G42();
    public static final Block G43 = new G43();
    public static final Block G44 = new G44();
    public static final Block G45 = new G45();
    public static final Block G46 = new G46();
    public static final Block G47 = new G47();
    public static final Block G48 = new G48();
    public static final Block G49 = new G49();
    public static final Block G50 = new G50();
    public static final Block G51 = new G51();
    public static final Block G52 = new G52();
    public static final Block G53 = new G53();
    public static final Block G54 = new G54();
    public static final Block G55 = new G55();

    public static final Block FG53 = new FG53();
    public static final Block FG54 = new FG54();
    public static final Block FG55 = new FG55();
    public static final Block FG56 = new FG56();
    public static final Block FG57 = new FG57();
    public static final Block FG58 = new FG58();
    public static final Block FG59 = new FG59();
    public static final Block FG60 = new FG60();
    public static final Block FG61 = new FG61();
    public static final Block FG562 = new FG62();
    public static final Block FG63 = new FG63();
    public static final Block FG64 = new FG64();
    public static final Block FG65 = new FG65();
    public static final Block FG66 = new FG66();
    public static final Block FG67 = new FG67();
    public static final Block FG68 = new FG68();
    public static final Block FG69 = new FG69();
    public static final Block FG70 = new FG70();
    public static final Block FG71 = new FG71();
    public static final Block FG72 = new FG72();

    public static final Block DT = new DT();


    public static final Block N1 = new N1();
    public static final Block N2 = new N2();
    public static final Block MIRROR = new Mirror();
    public static final Block ALU = new Alu().setLightLevel(0.1F);
    public static final Block CBB = new CBB().setLightLevel(0.1F);
    public static final Block FAN = new Fan();

    public static final Block C1 = new C1();
    public static final Block C2 = new C2();
    public static final Block C3 = new C3();
    public static final Block C4 = new C4();
    public static final Block C5 = new C5();

    public static final Block A = new A();
    public static final Block B = new B();
    public static final Block C = new C();
    public static final Block D = new D();
    public static final Block E = new E();
    public static final Block F = new F();
    public static final Block G = new G();
    public static final Block SIT = new Sit();
    public static final Block STAR = new Star();
    public static final Block SKY = new Sky();

    public static final Block URINAL = new Urinal();

    public static final Block FC = new FC();
    public static final Block VOLTAGE = new Voltage();

    public static final Block SC = new SC().setLightLevel(0.1F);
    public static final Block WTABLE = new WTable().setLightLevel(0.1F);

    public static final Block CEMH = new CemH();
    public static final Block CEMT = new CemT();

    public static final Block BATH = new Bath();

    public static final Block QH = new QH();
    public static final Block CCH = new CCH();

    public static final Block BIKE1 = new Bike1();
    public static final Block BIKE2 = new Bike2();
    public static final Block BIKE3 = new Bike3();
    public static final Block BIKE4 = new Bike4();

    public static final Block TELE = new Tele();
    public static final Block BOARD = new Board();
    public static final Block WBOARD = new WBoard();
    public static final Block CAL = new Cal();

    public static final Block HWATER = new HWater().setLightLevel(0.1F);

    public static final Block WASH1 = new Wash1();
    public static final Block WASH2 = new Wash2();
    public static final Block WASH3 = new Wash3();
    public static final Block WASHER = new Washer();

    public static final Block CAM1 = new Cam1();
    public static final Block CAM2 = new Cam2();

    public static final Block WALL1 = new Wall1();
    public static final Block WALL2 = new Wall2();
    public static final Block WALL3 = new Wall3();
    public static final Block WALL4 = new Wall4();
    public static final Block WALL5 = new Wall5();
    public static final Block WALL6 = new Wall6();
    public static final Block WALL7 = new Wall7();
    public static final Block WALL8 = new Wall8();
    public static final Block WALL9 = new Wall9();
    public static final Block WALL10 = new Wall10();
    public static final Block WALL11 = new Wall11();
    public static final Block WALL12 = new Wall12();
    public static final Block WALL13 = new Wall13();
    public static final Block WALL14 = new Wall14();
    public static final Block WALL15 = new Wall15();


    public static final Block STONER = new StoneR();
    public static final Block STONER1 = new StoneR1();

    public static final Block SIGN1 = new Sign1().setLightLevel(0.1F);
    public static final Block SIGN2 = new Sign2().setLightLevel(0.1F);
    public static final Block SIGN3 = new Sign3().setLightLevel(0.1F);

    public static final Block SL1 = new SL1();
    public static final Block SL2 = new SL2();
    public static final Block SL3 = new SL3();

    public static final Block LCHAIR = new LChair();

    public static final Block PIPE1 = new Pipe1();
    public static final Block PIPE2 = new Pipe2();
    public static final Block PIPE3 = new Pipe3();
    public static final Block PIPE4 = new Pipe4();
    public static final Block PIPE5 = new Pipe5();
    public static final Block PIPE6 = new Pipe6();
    public static final Block PIPE7 = new Pipe7();
    public static final Block PIPE8 = new Pipe8();
    public static final Block PIPE9 = new Pipe9();

    public static final Block TOOL = new Tool();

    public static final Block TESTG = new TestG();
    public static final Block FEXT = new FExt();
    public static final Block FEXT1 = new FExt1();
    public static final Block DRINK = new Drink().setLightLevel(0.1F);
    public static final Block DRINK1 = new Drink1().setLightLevel(0.1F);
    public static final Block DRINK3 = new Drink3().setLightLevel(0.1F);
    public static final Block DRINK4 = new Drink4().setLightLevel(0.1F);
    public static final Block DRINK5 = new Drink5().setLightLevel(0.1F);
    public static final Block DRINK6 = new Drink6().setLightLevel(0.1F);
    public static final Block BOX1 = new Box1();


    public static final Block TREE = new Tree();
    public static final Block TREE1 = new Tree1();
    public static final Block TREE2 = new Tree2();
    public static final Block TREE3 = new Tree3();

    public static final Block TREEHOLE = new TreeHole();
    public static final Block ROADBLOCK = new RoadBlock();
    public static final Block MESH = new Mesh();

    public static final Block GIRLBEDR = new GirlBedR().setLightLevel(0.1F);
    public static final Block GIRLBEDL = new GirlBedL().setLightLevel(0.1F);
    public static final Block GIRLWASH = new GirlWash();
    public static final Block GIRLSHELF = new GirlShelf();

    public static final Block FC1 = new Fence1().setLightLevel(0.1F);
    public static final Block FC2 = new Fence2().setLightLevel(0.1F);
    public static final Block FC3 = new Fence3().setLightLevel(0.1F);
    public static final Block FC4 = new Fence4().setLightLevel(0.1F);
    public static final Block FC5 = new Fence5().setLightLevel(0.1F);
    public static final Block FC6 = new Fence6().setLightLevel(0.1F);
    public static final Block FC7 = new Fence7().setLightLevel(0.1F);
    public static final Block FC8 = new Fence8().setLightLevel(0.1F);
    public static final Block FC9 = new Fence9().setLightLevel(0.1F);
    public static final Block FC10 = new Fence10().setLightLevel(0.1F);
    public static final Block FC11 = new Fence11().setLightLevel(0.1F);

    public static final Block GTR = new GirlTR();
    public static final Block GTL = new GirlTL();

    public static final Block NN = new NN();

    public static final Block DEC1 = new Dec1();
    public static final Block DEC2 = new Dec2();
    public static final Block DEC3 = new Dec3();
    public static final Block DEC4 = new Dec4();


    public static final Block TT = new TTable().setLightLevel(0.1F);

    public static final Block ELECTRIC = new Electric().setLightLevel(0.1F);

    public static final Block HR1 = new HR1();
    public static final Block HR2 = new HR2();
    public static final Block HR3 = new HR3().setLightLevel(0.1F);
    public static final Block HR4 = new HR4();
    public static final Block HR5 = new HR5();

    public static final Block YF = new YF();
    public static final Block YF1 = new YF1();
    public static final Block YF2 = new YF2();
    public static final Block YF3 = new YF3();
    public static final Block YF4 = new YF4();
    public static final Block YF5 = new YF5();
    public static final Block YF6 = new YF6();
    public static final Block YF7 = new YF7();
    public static final Block YF8 = new YF8();

    public static final Block YF11 = new YF11();

    public static final Block ELEV = new EleV();

    public static final Block FlowerDid1 = new FNorthHall1().setLightLevel(0.1F);
    public static final Block FlowerDid2 = new FNorthHall2().setLightLevel(0.1F);
    public static final Block FlowerDid3 = new FNorthHall3().setLightLevel(0.1F);
    public static final Block FlowerDid4 = new FNorthHall4().setLightLevel(0.1F);
    public static final Block FlowerDid5 = new FNorthHall5().setLightLevel(0.1F);

    public static final Block FlowerDid6 = new FDoorScreen();
    public static final Block FlowerDid7 = new FDoorSwitch();
    public static final Block FlowerDid8 = new FHallScreen1();
    public static final Block FlowerDid9 = new FHallScreen2();

    public static final Block FlowerDid10 = new FGallery1();
    public static final Block FlowerDid11 = new FGallery2();
    public static final Block FlowerDid12 = new FGallery3();
    public static final Block FlowerDid13 = new FGallery4();
    public static final Block FlowerDid14 = new FGallery5();


    public static final Block FDS1 = new FYFDoor();
    public static final Block FDS2 = new FYFDoor1();
    public static final Block FDS3 = new FYFTL();
    public static final Block FDS4 = new FYFTL1();
    public static final Block FDS5 = new FYFTR();
    public static final Block FDS6 = new FYFTR1();

    public static final Block FDS61 = new FGirlDoor();
    public static final Block FDS62 = new FGirlDoor1();
    public static final Block FDS63 = new FGirlDoor2();
    public static final Block FDS64 = new FGirlDoor3();
    public static final Block FDS65 = new FGirlDoor4();
    public static final Block FDS66 = new FGirlDoor5();
    public static final Block FDS67 = new FGirlTL1();
    public static final Block FDS68 = new FGirlTR1();

    public static final Block FDD = new FHTable().setLightLevel(0.1F);
    public static final Block FDD1 = new FBTable().setLightLevel(0.1F);
    public static final Block FDD2 = new FRadiator();
    public static final Block FDD3 = new FMP();
    public static final Block FDD4 = new FWashl();
    public static final Block FDD5 = new FWashr();
    public static final Block FDD6 = new FYFdoor2();
    public static final Block FDD7 = new FYFdoor3();
    public static final Block FDD8 = new FYFdoor4();
    public static final Block FDD9 = new FYFdoor5();


    public static final Block FG73 = new FG73();
    public static final Block FG74 = new FG74();
    public static final Block FG75 = new FG75();
    public static final Block FWINL = new FWinL();
    public static final Block FWINR = new FWinR();

    public static final Block FPIPE = new FPipe();
    public static final Block FPIPE1 = new FPipe1();
    public static final Block FPIPE2 = new FPipe2();
    public static final Block FPIPE3 = new FPipe3();
    public static final Block FPIPE4 = new FPipe4();
    public static final Block FPIPE5 = new FPipe5();
    public static final Block FPIPE6 = new FPipe6();
    public static final Block FPIPE7 = new FPipe7();
    public static final Block FPIPE8 = new FPipe8();
    public static final Block FPIPE9 = new FPipe9();
    public static final Block FPIPE10 = new FPipe10();

    public static final Block FDOORNUM = new FDoorNum();
    public static final Block FCART = new FCart().setLightLevel(0.1F);
    public static final Block FTRASH = new FTrash();
    public static final Block FCHOP = new FChopsticks().setLightLevel(0.1F);

    public static final Block DATE2101 = new FVent();
    public static final Block DATE2102 = new FTSigh();
    public static final Block DATE2103 = new FCamera();
    public static final Block DATE2104 = new FCamera1();
    public static final Block DATE2105 = new FCamera2();
    public static final Block DATE2106 = new FCamera3();
    public static final Block DATE2107 = new FCamera4();
    public static final Block DATE2108 = new FCamera5();
    public static final Block DATE2109 = new FStation();
    public static final Block DATE21010 = new FStation1();
    public static final Block DATE21011 = new FStation2();
    public static final Block DATE21012 = new FG76();
    public static final Block DATE21013 = new FG81();
    public static final Block DATE21024 = new FG88();
    public static final Block DATE21025 = new FG89();
    public static final Block DATE21026 = new FG90();
    public static final Block DATE21027 = new FG91();
    public static final Block DATE21028 = new FG92();

    public static final Block DATE02211 = new FCart1().setLightLevel(0.1F);
    public static final Block DATE02212 = new FLChair();
    public static final Block DATE02213 = new FHump();
    public static final Block DATE02214 = new FHump1();
    public static final Block DATE02215 = new FWell();
    public static final Block DATE02216 = new FWell1();
    public static final Block DATE02217 = new FWell2();
    public static final Block DATE02218 = new FWell3();
    public static final Block DATE02219 = new FLight11();
    public static final Block DATE022110 = new FStool();
    public static final Block DATE022111 = new FStool1();
    public static final Block DATE022112 = new FBrailingl().setLightLevel(0.1F);
    public static final Block DATE022113 = new FBrailingr().setLightLevel(0.1F);
    public static final Block DATE022114 = new FG77();
    public static final Block DATE022115 = new FG78();
    public static final Block DATE022116 = new FG79();
    public static final Block DATE022117 = new FG80();


    public static final Block FENCEX = new FenceO();

    public static final Block DATE02221 = new FCTable().setLightLevel(0.1F);
    public static final Block DATE02222 = new FCTable1().setLightLevel(0.1F);
    public static final Block DATE02223 = new FFan();
    public static final Block DATE02224 = new FVent1();
    public static final Block DATE0222401 = new FVent2();
    public static final Block DATE02225 = new FCTV();
    public static final Block DATE02226 = new FCTV1();
    public static final Block DATE02227 = new FLine();
    public static final Block DATE02228 = new FLine1();
    public static final Block DATE02229 = new FLine2();
    public static final Block DATE022210 = new FLine3();
    public static final Block DATE022211 = new FLine4();
    public static final Block DATE022212 = new FLine5();
    public static final Block DATE022213 = new FLine6();
    public static final Block DATE022214 = new FLine7();
    public static final Block DATE022215 = new FLine8();
    public static final Block DATE022216 = new FLine9();
    public static final Block DATE022217 = new FLine11();
    public static final Block DATE022218 = new FLine12();
    public static final Block DATE022219 = new FLine13();
    public static final Block DATE022220 = new FLine14();
    public static final Block DATE022221 = new FLine15();
    public static final Block DATE022222 = new FLine16();
    public static final Block DATE022223 = new FLine17();
    public static final Block DATE022224 = new FLine18();
    public static final Block DATE022225 = new FLine19();
    public static final Block DATE022226 = new FLine20();
    public static final Block DATE022227 = new FLine21();
    public static final Block DATE022228 = new FLine22();
    public static final Block DATE022229 = new FLine23();
    public static final Block DATE022230 = new FLine10();
    public static final Block DATE022231 = new FLine24();

    public static final Block DATE02281 = new BlueDesk5().setLightLevel(0.1F);
    public static final Block DATE02282 = new BlueDesk4().setLightLevel(0.1F);
    public static final Block DATE02283 = new BlueDesk3().setLightLevel(0.1F);
    public static final Block DATE02284 = new BlueDesk2().setLightLevel(0.1F);
    public static final Block DATE02285 = new BlueDesk1().setLightLevel(0.1F);

    public static final Block DATE02286 = new WoodDesk1().setLightLevel(0.1F);
    public static final Block DATE02287 = new WoodDesk2().setLightLevel(0.1F);
    public static final Block DATE02288 = new WoodDesk3().setLightLevel(0.1F);
    public static final Block DATE02289 = new WoodDesk4().setLightLevel(0.1F);
    public static final Block DATE022810 = new WoodDesk5().setLightLevel(0.1F);

    public static final Block DATE022811 = new FG82();
    public static final Block DATE022812 = new FG83();
    public static final Block DATE022813 = new FG84();
    public static final Block DATE022814 = new FG85();
    public static final Block DATE022815 = new FG86();
    public static final Block DATE022816 = new FSWash();
    public static final Block DATE022817 = new FYFDoor6();
    public static final Block DATE022818 = new FYFDoor7();
    public static final Block DATE022819 = new FYFDoor8();
    public static final Block DATE022820 = new FYFDoor9();
    public static final Block DATE022823 = new FG87();

    public static final Block DATE022828 = new FCFloor();
    public static final Block DATE022824 = new FCFloor1();
    public static final Block DATE022825 = new FCFloor2();
    public static final Block DATE022826 = new FCFloor3();
    public static final Block DATE022827 = new FCFloor4();

    public static final Block DATE03101 = new FContainer().setLightLevel(0.1F);
    public static final Block DATE03102 = new FContainer1().setLightLevel(0.1F);
    public static final Block DATE03103 = new FContainer2().setLightLevel(0.1F);
    public static final Block DATE03104 = new FG93();
    public static final Block DATE03105 = new FG94();
    public static final Block DATE03106 = new FG95();
    public static final Block DATE03107 = new FG96();
    public static final Block DATE03108 = new FLight12();
    public static final Block DATE03109 = new FLight13();
    public static final Block DATE031010 = new FSign().setLightLevel(0.1F);
    public static final Block DATE031011 = new FSign2().setLightLevel(0.1F);
    public static final Block DATE031012 = new FSign1().setLightLevel(0.1F);
    public static final Block DATE031013 = new FSign3().setLightLevel(0.1F);
    public static final Block DATE031014 = new FWindow();
    public static final Block DATE031015 = new FWindow1();
    public static final Block DATE031016 = new FWindow2();
    public static final Block DATE031017 = new FWindow3();
    public static final Block DATE031018 = new FWindow4();
    public static final Block DATE031019 = new FWindow5();
    public static final Block DATE031020 = new InSign().setLightLevel(0.1F);
    public static final Block DATE031021 = new InSign1().setLightLevel(0.1F);
    public static final Block DATE031022 = new InSign2().setLightLevel(0.1F);
    public static final Block DATE031023 = new InSign3().setLightLevel(0.1F);
    public static final Block DATE031024 = new InSign4().setLightLevel(0.1F);
    public static final Block DATE031025 = new InSign5().setLightLevel(0.1F);
    public static final Block DATE031026 = new InSign6().setLightLevel(0.1F);
    public static final Block DATE031027 = new OutSign().setLightLevel(0.1F);

    public static final Block PLANT = new Plant().setLightLevel(0.1F);
    public static final Block PLANT1 = new Plant1().setLightLevel(0.1F);
    public static final Block PLANT2 = new Plant2().setLightLevel(0.1F);

    public static final Block DATE03121 = new FCTable2().setLightLevel(0.1F);
    public static final Block DATE03122 = new FCTable3().setLightLevel(0.1F);
    public static final Block DATE03123 = new FCTable4().setLightLevel(0.1F);
    public static final Block DATE03124 = new FCTable5().setLightLevel(0.1F);
    public static final Block DATE03125 = new FRoadblocks();
    public static final Block DATE03126 = new FRod();
    public static final Block DATE03127 = new FRod1();
    public static final Block DATE03128 = new FSign4().setLightLevel(0.1F);
    public static final Block DATE03129 = new FSign5().setLightLevel(0.1F);
    public static final Block DATE031210 = new FSign6().setLightLevel(0.1F);
    public static final Block DATE031211 = new FSign7().setLightLevel(0.1F);
    public static final Block DATE031212 = new FSign8().setLightLevel(0.1F);
    public static final Block DATE031213 = new FSmoke();
    public static final Block DATE031214 = new FCTable6().setLightLevel(0.1F);
    public static final Block DATE031215 = new FShelf().setLightLevel(0.1F);
    public static final Block DATE031216 = new FShelf1().setLightLevel(0.1F);
    public static final Block DATE031217 = new FBox().setLightLevel(0.1F);
    public static final Block DATE031218 = new FBox1().setLightLevel(0.1F);
    public static final Block DATE031219 = new FSwitch();
    public static final Block DATE031220 = new FStove().setLightLevel(0.1F);
    public static final Block DATE031221 = new FStove1(false).setLightLevel(0.1F);
    public static final Block DATE031222 = new FStove2(false).setLightLevel(0.1F);


    public static final Block DHALL = new DHall().setLightLevel(0.1F);
    public static final Block DHALL1 = new DHall1().setLightLevel(0.1F);
    public static final Block DHALL2 = new DHall2().setLightLevel(0.1F);
    public static final Block DHALL3 = new DHall3().setLightLevel(0.1F);
    public static final Block DHALL4 = new DHall4().setLightLevel(0.1F);
    public static final Block DHALL5 = new DHall5().setLightLevel(0.1F);
    public static final Block DHALL6 = new DHall6().setLightLevel(0.1F);
    public static final Block DHALL7 = new DHall7().setLightLevel(0.1F);
    public static final Block DHALL8 = new DHall8().setLightLevel(0.1F);
    public static final Block DHALL9 = new DHall9().setLightLevel(0.1F);
    public static final Block DHALL10 = new DHall10().setLightLevel(0.1F);
    public static final Block DHALL11 = new DHall11().setLightLevel(0.1F);
    public static final Block DHALL12 = new DHall12().setLightLevel(0.1F);
    public static final Block DHALL13 = new DHall13().setLightLevel(0.1F);

    public static final Block PROJ = new Projector();

    public static final Block DATE04301 = new MarketCabinetFreezer().setLightLevel(0.1F);
    public static final Block DATE04302 = new MarketCashierDeskLeft().setLightLevel(0.1F);
    public static final Block DATE04303 = new MarketCashierDeskRight().setLightLevel(0.1F);
    public static final Block DATE04304 = new MarketMilkBox().setLightLevel(0.1F);
    public static final Block DATE04305 = new MarketOfficeCabinetDown().setLightLevel(0.1F);
    public static final Block DATE04306 = new MarketOfficeCabinetUp().setLightLevel(0.1F);
    public static final Block DATE04307 = new CenterAirconditionerBias();
    public static final Block DATE04308 = new ClassroomMicrophone();
    public static final Block DATE04309 = new MetalTrashcan();
    public static final Block DATE04310 = new Platform();
    public static final Block DATE04311 = new PlatformChair();
    public static final Block DATE04312 = new PlatformCorner();
    public static final Block DATE04313 = new PlatformDesk().setLightLevel(0.1F);
    public static final Block DATE04314 = new TopAirconditioner();

    public static final Block WINDOW10 = new Window10();
    public static final Block WINDOW11 = new Window11();



    public static final GrayBrick Gray_Brick = new GrayBrick();

    public static final PlaygroundBadmintonNet Playground_Badminton_Net = new PlaygroundBadmintonNet();
    public static final PlaygroundBadmintonNetSide Playground_Badminton_Net_Side = new PlaygroundBadmintonNetSide();

    public static final PlaygroundDoorClosed Playground_Door_Closed = new PlaygroundDoorClosed();
    public static final PlaygroundDoorOpenedLeft Playground_Door_Opened_Left = new PlaygroundDoorOpenedLeft();
    public static final PlaygroundDoorOpenedRight Playground_Door_Opened_Right = new PlaygroundDoorOpenedRight();

    public static final PlaygroundFenceDown Playground_Fence_Down = new PlaygroundFenceDown();
    public static final PlaygroundFenceDown2 Playground_Fence_Down2 = new PlaygroundFenceDown2();
    public static final PlaygroundFenceDownClapboard Playground_Fence_Down_Clapboard = new PlaygroundFenceDownClapboard();
    public static final PlaygroundFenceDownCorner Playground_Fence_Down_Corner = new PlaygroundFenceDownCorner();
    public static final PlaygroundFenceDownTriangle Playground_Fence_Down_Triangle = new PlaygroundFenceDownTriangle();
    public static final PlaygroundFenceUp Playground_Fence_Up = new PlaygroundFenceUp();
    public static final PlaygroundFenceUp2 Playground_Fence_Up2 = new PlaygroundFenceUp2();

    public static final PlaygroundFenceUpClapboard Playground_Fence_Up_Clapboard = new PlaygroundFenceUpClapboard();
    public static final PlaygroundFenceUpCorner Playground_Fence_Up_Corner = new PlaygroundFenceUpCorner();
    public static final PlaygroundFenceUpTriangle Playground_Fence_Up_Triangle = new PlaygroundFenceUpTriangle();

    public static final PlaygroundLight Playground_Light = new PlaygroundLight();

    public static final PlaygroundGreen Playground_Green = new PlaygroundGreen();
    public static final PlaygroundRed Playground_Red = new PlaygroundRed();

    public static final PlaygroundSign Playground_Sign = new PlaygroundSign();
    public static final PlaygroundSign2 Playground_Sign2 = new PlaygroundSign2();

    public static final PlaygroundVolleyballNet Playground_Volleyball_Net = new PlaygroundVolleyballNet();
    public static final PlaygroundVolleyballNetSide Playground_Volleyball_Net_Side = new PlaygroundVolleyballNetSide();

    public static final Sign_YTY_Yun SIGN_YTY_YUN = new Sign_YTY_Yun();
    public static final Sign_YTY_Tian SIGN_YTY_TIAN = new Sign_YTY_Tian();
    public static final Sign_YTY_Yuan SIGN_YTY_YUAN = new Sign_YTY_Yuan();


}
