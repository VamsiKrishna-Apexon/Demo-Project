import os
import platform
from datetime import datetime, timedelta

def get_system_uptime():
    """
    Print the system uptime in a human-readable format.
    Works on Windows, Linux, and macOS.
    """
    try:
        if platform.system() == "Windows":
            # For Windows, use wmic command
            uptime_seconds = os.popen('wmic os get lastbootuptime').read().split('\n')[1].strip()
            # Parse Windows uptime format
            boot_time = datetime.strptime(uptime_seconds[:14], "%Y%m%d%H%M%S")
            uptime = datetime.now() - boot_time
        else:
            # For Linux and macOS, use uptime command
            uptime_str = os.popen('uptime -p').read().strip()
            print(f"System Uptime: {uptime_str}")
            return uptime_str
        
        # Format uptime for Windows
        days = uptime.days
        seconds = uptime.seconds
        hours = seconds // 3600
        minutes = (seconds % 3600) // 60
        
        uptime_formatted = f"{days} days, {hours} hours, {minutes} minutes"
        print(f"System Uptime: {uptime_formatted}")
        return uptime_formatted
        
    except Exception as e:
        print(f"Error retrieving system uptime: {e}")
        return None

if __name__ == "__main__":
    print(f"Platform: {platform.system()}")
    print(f"Current Time: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    get_system_uptime()
