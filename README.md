# Clean-code-demo

1. Single responsibility principle
CarDetails class changes only for 1 reason, i.e, to add or remove any new car models.

2. Open closed Principle & Liskov Substitution Principle
OCP - open for extension, closed for modification.
For any new modifications, the class must be extensible and its functionalities should be reusable in its subclass,
so that no modifications are made to the existing class.

Example : Fuel type could include both petrol and diesel. But in order to make a modification of adding electric,
create an interface and extend it to whatever modification necessary.(i.e, electric type) Now we are not modifying the
pre-existing class, but simply implementing(extending) it to the modification.

3.LSP - the subclass should be substitutable with its base class.
Any functionality in the parent must be completely be used in its child class. There shouldn't be any function that cannot
be extended into the child.

Example : We could add Fuel_price() within Fuel_type, but it cannot be extended by electric, cuz it doesn't need to display
fuel price. Hence, all functionalities are not be extended into the child class, and the child is not a full substitute of
the parent. Therefore, we create separate interfaces Fuel_Price and is implemented by the required classes only.
Now Fuel_type interface is fully extended by Petrol, diesel and electric and follows LSP.

4.Interface Segregation - no class should be forced to implement an interface that it does not use. Large interfaces
must be split into smaller ones so that only the necessary ones are implemented.

5.Dependency inversion - high level modules shouldn't depend on low level modules, but they should both depend on the
abstraction.
By default, since the program follows OCP and LSP, it also follows DIP. Because DIP depends on abstraction.
And now the high level modules are independent of the low level ones because of the abstraction(interface).
