import win32gui
import win32api
import time

# Find the window with the title "Visual Studio Code"
hwnd = win32gui.FindWindow(None, "Visual Studio Code")

while True:
    # Get the window rectangle
    rect = win32gui.GetWindowRect(hwnd)

    # Move the mouse cursor to the center of the window
    x = rect[0] + (rect[2] - rect[0]) // 2
    y = rect[1] + (rect[3] - rect[1]) // 2
    win32api.SetCursorPos((x, y))

    # Simulate a left mouse button click
    win32api.mouse_event(2, 0, 0, 0, 0)
    win32api.mouse_event(4, 0, 0, 0, 0)

    # Simulate some keyboard strokes
    win32api.keybd_event(0x11, 0, 0, 0)  # Ctrl key down
    win32api.keybd_event(0x53, 0, 0, 0)  # S key down
    win32api.keybd_event(0x53, 0, 2, 0)  # S key up
    win32api.keybd_event(0x11, 0, 2, 0)  # Ctrl key up

    time.sleep(10)  # Wait for 10 seconds
