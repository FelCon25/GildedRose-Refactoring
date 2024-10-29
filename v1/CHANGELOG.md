# Changelog - Version 1 (v1)

## Description

This version represents the original base code without modifications. It includes the logic to update the `quality` and `sellIn` values of items, with specific rules for "Aged Brie," "Backstage passes," and "Sulfuras."

## Item Behavior

1. **Common Items**:

   - `quality` decreases by 1 each day, and by 2 if `sellIn` has passed.
   - `quality` can never be negative.

2. **Aged Brie**:

   - `quality` increases by 1 each day, up to a maximum of 50.
   - `sellIn` decreases every day.

3. **Backstage Passes**:

   - `quality` increases by 1, 2, or 3 depending on the remaining days.
   - If `sellIn` has passed, `quality` drops to 0.

4. **Sulfuras**:
   - `quality` is always 80 and never decreases.
   - `sellIn` remains unchanged.

## Version Notes

- This version represents the starting point.
- No refactoring or additional changes have been applied.
