# enhancedShippingContainerCalculator
You work for a firm that manufactures small bouncy balls in different colors, each in a small product box. (The Science Museum buys bouncy balls that look like the earth from this firm.) The product boxes fit into a packing box that holds 40 of the product boxes. When a client orders 40 or 80 or 120 bouncy balls, it’s easy to ship a 1, 2, or 3 of the packing boxes. When a client places a larger order (like Wal-Mart or Target), the packing boxes are packed into larger shipping containers, which hold 20 of the packing boxes. For example, one shipping container holds 20 packing boxes, and one packing box holds 40 product boxes (each hold 1 bouncy ball), so one shipping container holds 800 bouncy balls (20 boxes * 40 balls in a box). When one of those large orders come in, your firm builds the boxes on demand. It’s a waste of space and utilities to have a warehouse full of empty boxes, so the box materials are stored flat. To fulfill a large order, you need to calculate how many packing boxes must be built to hold the product boxes, and how many shipping containers must be built to ship those packing boxes. Each product box and shipping container must be full. If there are unpacked items, you need to report how many, and management can decide what to do.  Write a program that determines how many packing boxes (1 packing box holds 40 product boxes) and how many shipping containers (1 shipping container holds 20 packing boxes) are needed for a large order. For example, for an order of 9000 bouncy balls, you need 225 packing boxes and 11 shipping containers, with 5 packing boxes not packed into a shipping container. That is, the 9000 bouncy ball product boxes fit into 225 packing boxes; then, 220 of those packing boxes fit into 11 shipping containers, with 5 packing boxes left over.  Add the code necessary to ask the user how many bouncy balls need to be shipped, making this more useful than a project with numbers hard-coded into it. Display a title that describes the project, with your name. Prompt the user with a question, and write the code so that the user types the number to the right of the same line as the question. Put a blank line between the user input and the report of the results. Echo the number of items to ship, then display the number of packing boxes and shipping containers needed for that number of items, and how many items did not fit into packing boxes and how many packing boxes do not fit in a shipping container.
