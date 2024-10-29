# Changelog

## Version 4 (v4)

### Description
This version introduces further improvements to enhance type safety, performance, and code organization.

### Changes
1. Introduced an `ItemType` enum:
   - Replaced string comparisons with enum-based type checking.
   - Improved type safety and reduced the risk of typos in item name comparisons.
2. Implemented a factory pattern for creating item strategies:
   - Used an `EnumMap` to store and retrieve strategies based on item types.
3. Added input validation:
   - Ensured item quality never exceeds 50 (except for Sulfuras) after updates.
4. Optimized the update process:
   - Used Java 8 Streams to process items, allowing for potential parallel processing in the future.
5. Improved code organization:
   - Separated `ItemType` into its own file for better modularity.

### Item Behavior
- All item behaviors remain the same as in Version 3.

### Version Notes
- The new enum-based approach allows for easier addition of new item types and better type safety.
- Input validation ensures that item quality stays within the specified bounds.
