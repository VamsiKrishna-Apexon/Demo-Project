# Demo-Project

## Project Description
Given below DataBase Schema, create a Rest API
When project_id is given as input,
Then it should return project details and the number of employees in each project

```
employees                             projects
+---------------+---------+           +---------------+---------+
| id            | int     |<----+  +->| id            | int     |
| first_name    | varchar |     |  |  | title         | varchar |
| last_name     | varchar |     |  |  | start_date    | date    |
| salary        | int     |     |  |  | end_date      | date    |
| department_id | int     |--+  |  |  | budget        | int     |
+---------------+---------+  |  |  |  +---------------+---------+
                             |  |  |
departments                  |  |  |  employees_projects
+---------------+---------+  |  |  |  +---------------+---------+
| id            | int     |<-+  |  +--| project_id    | int     |
| name          | varchar |     +-----| employee_id   | int     |
+---------------+---------+           +---------------+---------+
```

---

## Recent Changes

### System Uptime Script (`copilot_test.py`)

A new cross-platform system uptime utility script has been added to the project.

#### Features
- **Cross-Platform Support**: Works on Windows, Linux, and macOS
- **Human-Readable Output**: Displays uptime in the format: `X days, Y hours, Z minutes`
- **Error Handling**: Includes try-catch blocks to gracefully handle errors
- **System Information**: Shows platform type and current system time alongside uptime

#### How It Works

**Windows**: Uses `wmic os get lastbootuptime` command to retrieve the last boot time and calculates uptime

**Linux & macOS**: Uses the `uptime -p` command which directly provides formatted uptime information

#### Usage
```bash
python copilot_test.py
```

#### Example Output
```
Platform: Linux
Current Time: 2026-07-17 11:31:38
System Uptime: up 5 days, 3 hours, 42 minutes
```

#### Dependencies
- Python Standard Library only (no external dependencies required)
- Uses built-in modules: `os`, `platform`, `datetime`

#### Compatibility
- ✅ Windows (7, 10, 11 and later)
- ✅ Linux (Ubuntu, Debian, CentOS, etc.)
- ✅ macOS (Sierra and later)

---

## Files Modified/Added
- ✨ `copilot_test.py` - New system uptime script
- 📝 `README.md` - Updated with recent changes documentation
