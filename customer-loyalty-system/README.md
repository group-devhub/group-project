# Customer Loyalty Reward System

**Contributor:** Brian Mwangi  
**Admission number:** CT206/124741/25  
**Course:** Bcsf Computer Security and Forensics  
**Unit:** Data Structures

## Purpose

This Java program demonstrates Task 4 of the Fibonacci Series case study. It accepts the number of years a customer has been loyal, generates Fibonacci-based reward points, stores the results in an array, and displays the points for each year.

## Rule used

- Year 1 receives 0 points.
- Year 2 receives 1 point.
- Each later year receives the sum of the previous two years' points.

This is an example policy for the assignment; a real company would define its own reward policy.

## Data structures and algorithm

- **Array (`long[] rewards`):** stores reward points for each year.
- **Iteration (`for` loop):** calculates each value once using the two previous values.
- **Input validation:** rejects non-integer input and values outside the supported range.

## Complexity

For `n` loyalty years:
- Time complexity: **O(n)**.
- Space complexity: **O(n)** because the array stores one result per year.

## Compile and run

```bash
javac CustomerLoyaltySystem.java
java CustomerLoyaltySystem
```

## Sample output

```text
Enter number of loyalty years (1-93): 8

CUSTOMER LOYALTY REWARDS
Year 1: 0 points
Year 2: 1 point
Year 3: 1 point
Year 4: 2 points
Year 5: 3 points
Year 6: 5 points
Year 7: 8 points
Year 8: 13 points
```

## Scope and limitations

This educational program prints reward points but does not connect to a database or store customer identities. A production system would need a defined business policy, persistent storage, and appropriate protection of customer data.
