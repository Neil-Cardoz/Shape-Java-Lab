# Geometric Shape Calculator

## Overview
This Java-based Geometric Shape Calculator provides functionality to compute essential measurements such as area, perimeter, and volume for various two-dimensional and three-dimensional shapes. The design follows Object-Oriented Programming (OOP) principles, leveraging abstraction, inheritance, and interfaces.

### Supported Shapes:
- **2D Shapes:** Triangle, Rectangle, Square, Circle
- **3D Shapes:** Cube, Sphere, Cylinder, Equilateral Pyramid
- Interactive menu-based system for ease of use

---
## Requirements
Ensure you have the following set up before executing the program:
- **Java Development Kit (JDK) 8 or newer** installed
- **An IDE or code editor** (such as IntelliJ IDEA, Eclipse, VS Code, or Notepad++)
- **Command-line access** to compile and run Java files

To verify your Java installation, use:
```sh
java -version
```

## Code Structure

### Shape.java
An abstract superclass defining common attributes and abstract methods applicable to all shapes.

### VolumeInterface.java
An interface specifically for three-dimensional shapes that require volume calculations.

### Shape Implementations
Each shape class extends Shape and implements VolumeInterface where needed:
- **Triangle.java** (inherits from Shape)
- **Rectangle.java** (inherits from Shape)
- **Square.java** (inherits from Shape)
- **Circle.java** (inherits from Shape)
- **Cube.java** (inherits from Shape, implements VolumeInterface)
- **Sphere.java** (inherits from Shape, implements VolumeInterface)
- **Cylinder.java** (inherits from Shape, implements VolumeInterface)
- **EquilateralPyramid.java** (inherits from Shape, implements VolumeInterface)

### Main.java
Handles user interactions through a menu-driven approach, allowing calculations based on user input.

---
## Class Details

### Shape.java
| Method | Functionality |
|--------|--------------|
| `Shape()` | Initializes dimensions to zero. |
| `Shape(double dim1, double dim2, double dim3, int sides)` | Constructor to initialize shape properties. |
| `calculateArea()` | Abstract method for area computation. |
| `calculatePerimeter()` | Abstract method for perimeter computation. |
| `getNumSides()` | Retrieves the number of sides of a shape. |

### VolumeInterface.java
| Method | Functionality |
|--------|--------------|
| `calculateVolume()` | Abstract method implemented by 3D shapes for volume computation. |

### Shape Classes
Each class extends Shape and contains relevant formulas.

#### Triangle.java
| Method | Functionality |
|--------|--------------|
| `Triangle(double base, double height)` | Initializes a triangle with given dimensions. |
| `calculateArea()` | Computes `0.5 * base * height`. |
| `calculatePerimeter()` | Determines perimeter using the sum of sides. |

#### Rectangle.java
| Method | Functionality |
|--------|--------------|
| `Rectangle(double length, double width)` | Initializes rectangle properties. |
| `calculateArea()` | Computes `length * width`. |
| `calculatePerimeter()` | Computes `2 * (length + width)`. |

#### Square.java
| Method | Functionality |
|--------|--------------|
| `Square(double side)` | Initializes square dimensions. |
| `calculateArea()` | Computes `side * side`. |
| `calculatePerimeter()` | Computes `4 * side`. |

#### Circle.java
| Method | Functionality |
|--------|--------------|
| `Circle(double radius)` | Initializes the circle. |
| `calculateArea()` | Computes `π * radius²`. |
| `calculatePerimeter()` | Computes `2 * π * radius`. |

#### Cube.java
| Method | Functionality |
|--------|--------------|
| `Cube(double side)` | Initializes a cube. |
| `calculateArea()` | Computes `6 * side²`. |
| `calculatePerimeter()` | Computes `12 * side`. |
| `calculateVolume()` | Computes `side³`. |

#### Sphere.java
| Method | Functionality |
|--------|--------------|
| `Sphere(double radius)` | Initializes sphere properties. |
| `calculateArea()` | Computes `4 * π * radius²`. |
| `calculatePerimeter()` | Computes circumference: `2 * π * radius`. |
| `calculateVolume()` | Computes `(4/3) * π * radius³`. |

#### Cylinder.java
| Method | Functionality |
|--------|--------------|
| `Cylinder(double radius, double height)` | Initializes a cylinder. |
| `calculateArea()` | Computes `2 * π * radius * (radius + height)`. |
| `calculatePerimeter()` | Computes `2 * (2 * radius + height)`. |
| `calculateVolume()` | Computes `π * radius² * height`. |

#### EquilateralPyramid.java
| Method | Functionality |
|--------|--------------|
| `EquilateralPyramid(double side, double height)` | Initializes the pyramid. |
| `calculateArea()` | Computes surface area using the respective formula. |
| `calculatePerimeter()` | Computes `4 * side`. |
| `calculateVolume()` | Computes `(1/3) * base_area * height`. |

### Main.java (Menu-Driven Interface)
Users can select a shape to perform calculations.

| Choice | Action |
|--------|--------|
| 1 | Compute area & perimeter of a Triangle. |
| 2 | Compute area & perimeter of a Rectangle. |
| 3 | Compute area, perimeter & volume of a Cube. |
| 4 | Compute area & perimeter of a Square. |
| 5 | Compute area & perimeter of a Circle. |
| 6 | Compute area, perimeter & volume of a Sphere. |
| 7 | Compute area, perimeter & volume of a Cylinder. |
| 8 | Compute area, perimeter & volume of an Equilateral Pyramid. |
| 9 | Exit the program. |

---
## Execution Instructions
1. Compile all Java files:
   ```sh
   javac Main.java
   ```
2. Run the program:
   ```sh
   java Main
   ```

