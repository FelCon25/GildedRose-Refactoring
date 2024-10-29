# Changelog

## Version 3 (v3)

### Description
This version introduces the Strategy pattern to improve code structure, maintainability, and extensibility.

### Changes
1. Implemented the Strategy pattern:
   - Created an `ItemStrategy` interface.
   - Implemented separate strategy classes for each item type.
   - Introduced a strategy map in the `GildedRose` class to manage different item strategies.
2. Improved code organization:
   - Separated each strategy into its own file for better modularity.
   - Created a base `RegularItemStrategy` class to reduce code duplication.
3. Enhanced extensibility:
   - New item types can be easily added by creating a new strategy class and adding it to the strategy map.

### Item Behavior
- All item behaviors remain the same as in Version 2.

### Version Notes
- The Strategy pattern allows for easier addition of new item types and modifications to existing ones.