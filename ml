import win32gui
import win32api
import win32con
import time
import random

# Find the window with the title "Visual Studio Code"
hwnd = win32gui.FindWindow(None, "Visual Studio Code")

while True:
    # Get the window rectangle
    rect = win32gui.GetWindowRect(hwnd)

    # Move the mouse cursor to a random position within the window
    x = random.randint(rect[0], rect[2])
    y = random.randint(rect[1], rect[3])
    win32api.SetCursorPos((x, y))

    # Simulate a random mouse event (left click, right click, or move)
    mouse_event = random.choice([2, 4, 1])  # 2 = left click, 4 = right click, 1 = move
    win32api.mouse_event(mouse_event, 0, 0, 0, 0)

    # Simulate a random keyboard event (press a key or release a key)
    key_code = random.choice([win32con.VK_SPACE, win32con.VK_LEFT, win32con.VK_RIGHT, win32con.VK_UP, win32con.VK_DOWN])
    key_event = random.choice([0, 2])  # 0 = key down, 2 = key up
    win32api.keybd_event(key_code, 0, key_event, 0)

    # Wait for a random amount of time (between 1 and 10 seconds)
    time.sleep(random.randint(1, 10))
