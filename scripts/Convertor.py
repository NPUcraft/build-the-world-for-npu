import python_nbt.nbt as nbt
import os

args = os.sys.argv

#读取map
mapName = "mapping.txt"
try:
    mapFile = open(mapName, "r")
except:
    print("mapping.txt not found")
    exit()
map = mapFile.readlines()
mapFile.close()
map1 = {}
#以=分割键值对
for i in range(len(map)):
    kv = map[i].split("=")
    kv[0] = "npu:" + kv[0].split(".")[1]
    kv[1] = "npu:" + kv[1].split(".")[1]
    map1[kv[0]] = kv[1]

print("reading " + args[1])
level = nbt.read_from_nbt_file(args[1])
ids = level["FML"]["Registries"]["minecraft:blocks"]["ids"]

convert = False
for id in ids:
    if map1.__contains__(id['K'].value):
        print(id['K'].value + " -> " + map1[id['K'].value])
        id['K'].value = map1[id['K'].value]
        convert = True
    #print(id['K'].value)
if not convert:
    print("No key was converted")
print("saving " + args[1])
nbt.write_to_nbt_file(args[1],level)