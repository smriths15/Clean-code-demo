package com.company.GoodCode;
/*Open closed Principle & Liskov Substitution Principle
OCP - open for extension, closed for modification.
For any new modifications, the class must be extensible and its functionalities should be reusable in its subclass,
so that no modifications are made to the existing class.

Example : Fuel type could include both petrol and diesel. But in order to make a modification of adding electric,
create an interface and extend it to whatever modification necessary.(i.e, electric type) Now we are not modifying the
pre-existing class, but simply implementing(extending) it to the modification.

*/
public interface Type {
    void Fuel();
}

