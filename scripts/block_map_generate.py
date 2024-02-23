# -*- coding: utf-8 -*-

original_block_id = {}
new_block_id = {}
with open('original.lang', 'r', encoding='utf-8') as f:
    for line in f:
        if len(line) == 1:
            continue
        key, value = line.split('=')
        original_block_id[value] = key

with open('../src/main/resources/assets/npu/lang/zh_cn.lang', 'r', encoding='utf-8') as f:
    for line in f:
        if len(line) == 1:
            continue
        key, value = line.split('=')
        new_block_id[value] = key

mapping = {}

for kv in original_block_id.items():
    if kv[1] != new_block_id[kv[0]]:
        mapping[kv[1]] = new_block_id[kv[0]]

with open("mapping.txt", "w") as f:
    for key, value in mapping.items():
        f.write(f"{key}={value}\n")
