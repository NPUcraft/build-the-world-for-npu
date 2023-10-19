# BuildTheWorldForNPU

#### 介绍
NPUcraft建筑服专属模组。

#### 适配版本
Forge：1.12.2-forge-2847

#### 运行指南
**仅支持 IntelliJ IDEA**
1. 在 IntelliJ 中，前往 "文件" -> "设置" -> "构建，执行，部署" -> "构建工具" -> "Gradle"。将 "使用以下方式构建和运行：" 设置为 IntelliJ IDEA，并确认 Gradle JVM 已设置为某个 JDK 1.8 的版本。
2. 在 IntelliJ 中，前往 "文件" -> "项目结构"。确保 SDK 也在这里设置为 1.8。将编译器输出设置为一个名为 "out" 的文件夹，位于项目根目录 - 你可能需要创建此文件夹。
3. 执行 Gradle 同步
4. 执行 Gradle `genIntellijRuns`

#### 使用说明

1.  禁止只改名字就传播

#### 参与贡献

1.  代码作者：TeachingFeelings、SUPER2FH
2.  协作者：翱翔——Soar
3.  其他作者：Mario_RainFlower

#### 说明

1.  该模组是NPUcraft建筑服专属模组，元素和模型为西工大特有。
2.  如果想修改发布，可联系邮箱1309251370@qq.com。
3.  模组内含防伪措施。

### 结构
#### Blocks
```shell

├─BuildBlocks
│  └─Ceiling
├─Constructions
├─Cube
├─DecorationBlocks - 这些方块仅用于建筑结构的装饰，从建筑中移除它们几乎不会引起明显变化。
│  ├─Bed
│  │  ├─Boy
│  │  └─Girl
│  ├─Camera
│  ├─Chair
│  ├─Desk
│  │  ├─Classroom
│  │  │  ├─Blue
│  │  │  └─Wood
│  │  ├─Foldable
│  │  └─Workshop
│  ├─Gun
│  ├─Light
│  │  ├─Common
│  │  ├─Dormitory
│  │  └─Floor
│  ├─Machine
│  ├─Painting
│  ├─Sign
│  ├─Stair
│  └─Vehicle
│      └─Bike
├─Decorations
├─DHalls
├─Doors
│  ├─Black
│  └─White
├─Drinks
├─Facility
├─Fence
├─Floors
├─FlowerDid
│  ├─Day221
│  ├─Day222
│  ├─Day228
│  ├─Day310
│  ├─Day312
│  └─Others
├─Furniture
├─G
├─Girl
├─HandRail
├─Market
├─Others
├─Pipe
├─Plants
├─Platform
├─Railings
├─Road
├─Signs
├─Slabs
├─StarSignPack
├─StreetLamp
├─Sundries
├─Trashs
├─Trees
├─Walls
├─Washes
├─WGWall
├─Windows
│  ├─Black
│  ├─Blue
│  ├─Normal
│  └─White
├─XingCao
│  └─Tents
└─YF
```
