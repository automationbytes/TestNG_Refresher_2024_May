import ctypes

# Get the user32 library
user32 = ctypes.WinDLL('user32', use_last_error=True)

# Define the key code for the 'A' key
VK_A = 0x41

# Press the 'A' key
user32.keybd_event(VK_A, 0, 0, 0)

# Release the 'A' key
user32.keybd_event(VK_A, 0, 2, 0)

import ctypes

# Get the user32 library
user32 = ctypes.WinDLL('user32', use_last_error=True)

# Move the mouse cursor to (100, 100)
user32.SetCursorPos(100, 100)

import win32gui
import win32api

# Find the window with the title "Notepad"
hwnd = win32gui.FindWindow(None, "Notepad")

# Set the focus to the window
win32gui.SetForegroundWindow(hwnd)

# Simulate a key press of the 'A' key
win32api.keybd_event(0x41, 0, 0, 0)
win32api.keybd_event(0x41, 0, 2, 0)

import win32gui
import win32api

# Find the window with the title "Notepad"
hwnd = win32gui.FindWindow(None, "Notepad")

# Get the window rectangle
rect = win32gui.GetWindowRect(hwnd)

# Move the mouse cursor to the center of the window
x = rect[0] + (rect[2] - rect[0]) // 2
y = rect[1] + (rect[3] - rect[1]) // 2
win32api.SetCursorPos((x, y))

# Simulate a left mouse button click
win32api.mouse_event(2, 0, 0, 0, 0)
win32api.mouse_event(4, 0, 0, 0, 0)
