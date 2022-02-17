# Customer Order System (COS)

## Problem Description

The Customer Order System (COS) provides the customer with the following services described  
as use cases. Describe your classes using the UML class diagram notation and implement the COS  
in Java.  Describe any assumptions you make.  
|**Use case name: Log On**| |
|:---|:---|
|**Precondition**|The customer has created an account with the ID and password, a security question, and the customer’s answer to the question.  |
|**Main sequence**|<ol><li>The customer enters the ID and password.</li><li>The system validates the customer ID and password.</li><li>If the customer ID and password are valid, the system displays the customer’s security question.</li><li>The customer enters the answer to the question.</li><li>If the customer’s response is the same as that stored in the system, the system displays a welcome message.</li></ol> |
|**Alternative sequence**|<ul><li>**Step 3:** If the customer’s ID does not exist in the system, the system displays no account and terminates.</li><li>**Step 3:** If the customer’s ID and password are invalid, the system displays an error message and prompts the customer to enter another ID and password. The system allows the customer to enter a maximum of three times. And then go to step 2.</li><li>**Step 5:** If the customer response is not the same, the system displays an error message and terminates.</li></ul>|


### Use case name: Log On  
****
**Precondition:** The customer has created an account with the ID and password, a security question, and  
the customer’s answer to the question.  

**Main sequence:**  
 1. The customer enters the ID and password.
 2. The system validates the customer ID and password.
 3. If the customer ID and password are valid, the system displays the customer’s security question.  
 4. The customer enters the answer to the question.  
 5. If the customer’s response is the same as that stored in the system, the system displays a welcome message.  

**Alternative sequence:**  

 - **Step 3:** If the customer’s ID does not exist in the system, the system displays no account and terminates.
 - **Step 3:** If the customer’s ID and password are invalid, the system displays an error message and prompts the customer to enter another ID and password. The system allows the customer to enter a maximum of three times. And then go to step 2.
 - **Step 5:** If the customer response is not the same, the system displays an error message and terminates.

Use case name:  Log Out  
Precondition:  The customer has logged into the system.  
Main sequence:  
1.  The customer selects “log out.”  
2.  The system makes customers log out.  
Alternative sequence:  None.  
Use case name:  Create Account  
Precondition:  None  
Main sequence:  
1.  The customer enters the customer ID.  
2.  The system checks if the customer ID exists.  
3.  If the customer ID is valid, the system prompts the customer to enter a password.  
4.  The system checks if the password has a minimum of six characters. The password must include  
at least a digit, a special character such as @, #, $, %, &, and *, and an upper case Alphabet.  
5.  If the password is valid, the system prompts the customer to enter the customer’s name, address,  
and credit card number.  
6.  The customer enters the customer’s name, address, and credit card number.  
7.  The system displays the confirmation message of account creation if the customer’s name,  
address, and credit card number are not null.  
Alternative sequence:
Step 3: If the same ID exists in the system, the system displays an error message and requests a  
different ID from the customer. And then go to step 2.  
Step 5: If the password is invalid, the system prompts the customer to enter another password.  
And then go to step 4.  
Step 7: If the customer’s name, address, or credit card number is null, the system prompts the  
customer to enter the customer’s name, address, or credit card number again. And then go to step  
6.  
Use case name:  Select Items.  
Precondition:  None.  
Main sequence:  
1.  The customer requests the product catalog to browse.  
2.  The system displays the product names, descriptions, regular prices, and sales prices.  
3.  The customer selects one or more products and quantities from the catalog.  
4.  The system adds the selected products and quantities to a cart.  
5.  The system displays the selected products, quantities, taxes, and the total price.  
Alternative sequence:  
  Step 3: Customer selects no product and exits.  
Use case name:  Make Order  
Precondition:  The customer has selected products to buy and logged into the system.  
Main sequence:  
1.  The customer places an order for the products selected.  
2.  The system displays delivery methods: (1) mail by charging a fee (e.g., $3.00 per order) or (2) in-  
store pick up for free.  
3.  The customer selects one of the delivery methods.  
4.  The system displays the total, including the mailing fee or free pickup.  
5.  The system retrieves the customer’s credit card from the customer’s account.  
6.  The system requests a bank to charge the total amount using the customer’s credit card.  
7.  If the bank approves the charge, the system receives a four-digit authorization number from the  
bank.  
8.  The system stores the customer order, containing the order date, customer ID, product name,  
quantity, total, and authorization number.  
9.  The system displays order confirmation to the customer.  
Alternative sequences:  
  Step 3: The customer does not select a delivery method and exits.  
  Step 7:  If the bank denies the charge (e.g., invalid credit card or over credit limit), the system  
prompts the customer to enter another credit card number. The customer can either enter a new  
credit card number or exit. If the new card is valid, the bank charges it using the new credit card,  
and the system receives a four-digit authorization number from the bank. The system updates its  
credit card number in the customer’s account.  
Use Case:  View Order  
Precondition:  Customer has logged in.  
Main sequence:  
1.  The customer requests all the customer’s order information.  
2.  The system displays each order with the customer order date, product names, quantities, and total.  
Alternative sequence:  None
