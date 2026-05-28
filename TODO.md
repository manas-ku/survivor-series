# Survivor Series - TODO

## Code Cleanup / Refactor
- [ ] Make constants for screen center (SCREEN_CENTER_X, SCREEN_CENTER_Y) based on panel width/height
- [ ] Draw hero and change every calculation centered on screen (top-left at SCREEN_CENTER_X - width/2, SCREEN_CENTER_Y - height/2) basically make every object assuming centred.
- [ ] Remove cameraX/cameraY and replace with hero world position directly
- [ ] Split GamePanel into separate classes (input handler, renderer, game loop)

## Features
- [ ] Proper wave spawning system (enemies spawn from screen edges)
- [ ] Combat — hero attack, enemy takes damage, enemy dies
- [ ] Hero takes damage on enemy contact
- [ ] Health bar UI
- [ ] Score / XP system
- [ ] Boss enemies
- [ ] Multiple enemy types
- [ ] Hero abilities (sprint with shift, attack with space)
