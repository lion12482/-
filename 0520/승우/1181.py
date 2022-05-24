a = int(input())

lst = []
for i in range(a):
    lst.append(input())

lst_set = list(set(lst))

lst_sort = []
for i in lst_set:
    lst_set.append((len(i), i))

result = sorted(lst_sort)

for lst_len, lst in result:
    print(lst)
