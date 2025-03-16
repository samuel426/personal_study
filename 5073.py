a = []
b = []

while True:
    try:
        A, B, C = map(int, input().split())
        b = [A, B, C]
        a.append(b)

    except:
        break

for n1, n2, n3 in a:
    i = []
    i.append(n1)
    i.append(n2)
    i.append(n3)
    i.sort()
    if(i[0] == i[1] == i[2] == 0):
        break
    elif(i[0] == i[1] == i[2]):
        print("Equilateral")
    elif(i[2] >= (i[0] + i[1])):
        print("Invalid")
    elif((i[0] == i[1]) or (i[1] == i[2])):
        print("Isosceles")
    else:
        print("Scalene")

