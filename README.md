# Calculator

This accepts statements using Add, Subtract, Multiply and Divide followed with 2 numbers. The following is a sample input and output produced:

<br />Invalid scenario:

<br />The inputs given are:
<br />Add 100d 20d
<br />Divide 1 0.2
<br />Multiply 10.0d 2d
<br />Subtract 500 100

<br />Computing...

<br />Results:
<br />100.0 + 20.0 = 120.0
<br />1.0 / 0.2 = 5.0
<br />10.0 * 2.0 = 20.0
<br />500.0 - 100.0 = 400.0

<br />Invalid scenario:

<br />The inputs given are:
<br />Add 10h0d 20d
<br />Divide 1 0.0
<br />Multiply 10.0d 2d
<br />Subtract 500 100

<br />Computing...
<br />One of the values is non-numeric : Add 10h0d 20d
<br />For input string: "10h0d"

<br />Results:
<br />The entry was invalid, so skipping it's result
<br />Denominator cannot be 0 while performing Divide action
<br />10.0 * 2.0 = 20.0
<br />500.0 - 100.0 = 400.0