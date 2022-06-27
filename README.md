# Intruduction
Exercise at college with products and eShop at java. In this program i used HashMap, HashSet and LinkedList to manage and filter the products of an eShop.

# Technologies
- [Java SE 17](https://www.oracle.com/java/technologies/downloads/archive/)

# Examples of use

Output with different queries below:

```
run:
--Shop Info--
Link: www.shop.com
Phone: 2103990
Email: shop@shop.com

--Get all products from category=book--
[Category: book
Avalable: yes
ID: 0078bb42-2300-436c-aed8-315cfdc34e89
Cost: 11]

--Category with costLimit=13 and category=book23--
[Category: book23
Avalable: yes
ID: 5c4542e2-57f0-424f-9454-5fb8d8e19c1b
Cost: 12]

--Get Available Products--
[Category: book23
Avalable: yes
ID: 5c4542e2-57f0-424f-9454-5fb8d8e19c1b
Cost: 12, Category: book
Avalable: yes
ID: 0078bb42-2300-436c-aed8-315cfdc34e89
Cost: 11]

--cheapest Products per Category--
{book23=[Category: book23
Avalable: yes
ID: 5c4542e2-57f0-424f-9454-5fb8d8e19c1b
Cost: 12], book=[Category: book
Avalable: yes
ID: 0078bb42-2300-436c-aed8-315cfdc34e89
Cost: 11]}
BUILD SUCCESSFUL (total time: 0 seconds)

```

# Launch
To run this project, type the following command inside the *~/password-creator/src* directory

```bash
$ javac Main.java
$ java Main
```

# Sources
- Java Api
- Tutorials from web
