# Changelog

## Version 2 (v2)

### Description

This version implements the handling of "Conjured" items and refactors the code for better readability and maintainability.

### Changes

1. Added support for "Conjured" items:
   - "Conjured" items now degrade in Quality twice as fast as normal items.
2. Refactored the code:
   - Separated the logic for different item types into separate methods.
   - Improved readability by using switch statements and descriptive method names.
   - Introduced helper methods for increasing and decreasing quality.

### Item Behavior

1. **Common Items**:

   - `quality` decreases by 1 each day, and by 2 if `sellIn` has passed.
   - `quality` can never be negative.

2. **Conjured Items**:

   - `quality` decreases by 2 each day, and by 4 if `sellIn` has passed.
   - `quality` can never be negative.

3. **Aged Brie**:

   - `quality` increases by 1 each day, up to a maximum of 50.
   - `sellIn` decreases every day.

4. **Backstage Passes**:

   - `quality` increases by 1, 2, or 3 depending on the remaining days.
   - If `sellIn` has passed, `quality` drops to 0.

5. **Sulfuras**:
   - `quality` is always 80 and never decreases.
   - `sellIn` remains unchanged.

### Version Notes

- The code structure has been improved for easier maintenance and future updates.