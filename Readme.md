# Domain Driven Design
### Problem #1 : Add a “IPad Pro” to a Cart
Note: Please do not model/use User class

### Problem #2: Add a “Hero ink Pen” to a Cart

### Problem #3: Add 2 qty of  “ GM Cricket bat” to Cart.

### Problem #4: Remove already added Item “IPad Pro”( with all quantities)  from cart.

### Problem #5: As a business User I would like to know which Products ( product name) were deleted from Cart.

### Problem #6: As a business User, I would like to differentiate between two Carts.
* Two carts where items are same, equality on Carts should return false


    Cart cart1 = Cart()

    Cart cart2 = Cart()

    Item item1 = new ( Item(Product("Ipad"), 1)

    Item item2 = new ( Item(Product("Ipad"), 1)

    cart1.add(item1)

    cart2.add(item2)

    cart1.equals(cart2)  should be false*
