credit:

Norberto Anguiano, Tony Daniels, Evan Selby, Junqing Xiao


# Tennis League Management System




Tennis League Management System is a Java application that interacts with a SQL database to manage records for teams, players, and coaches. The application uses JDBC for database connections and supports CRUD (Create, Read, Update, Delete) operations.

- Add, edit, and delete teams
- Manage player information and associations with teams
- Maintain coach records and their experience details
- View detailed lists of teams, players, and coaches

## Features

- Connect Java applications to SQL databases using JDBC
- Implement CRUD operations within the application
- Enhance teamwork and collaborative coding skills
- Utilize MySQL for database management

## Requirements

- MySQL Server
- MySQL Workbench
- Java Development Kit (JDK)
- Integrated Development Environment (IDE) like Visual Studio Code
- JDBC library for database connection

## Database Setup

### Step 1: Install MySQL Server

1. **Download and Install MySQL Server:**
   - Visit the [MySQL downloads page](https://dev.mysql.com/downloads/installer/) and download the MySQL installer.
   - Follow the installation instructions and complete the setup.

2. **Configure MySQL Server:**
   - During installation, configure the server with the default port (`3306`), set the root password, and note it down.

### Step 2: Install MySQL Workbench

1. **Download and Install MySQL Workbench:**
   - Visit the [MySQL Workbench downloads page](https://dev.mysql.com/downloads/workbench/) and download the installer.
   - Follow the installation instructions and complete the setup.

## Running MySQL Server

### Starting MySQL Server

#### Windows

1. **Open Services:**
   - Press `Win + R`, type `services.msc`, and press `Enter`.
   - Find `MySQL` or `MySQL57` in the list of services.
   - Right-click on it and select `Start`.

#### macOS/Linux

1. **Open Terminal:**
   - Run the following command to start MySQL server:
     ```bash
     sudo service mysql start
     ```

2. **Homebrew on macOS:**
   - If using Homebrew, run the following command:
     ```bash
     brew services start mysql
     ```

### Checking MySQL Server Status

#### Windows

1. **Open Services:**
   - Press `Win + R`, type `services.msc`, and press `Enter`.
   - Find `MySQL` or `MySQL57` in the list of services and ensure it is running.

#### macOS/Linux

1. **Open Terminal:**
   - Run the following command to check the status:
     ```bash
     sudo service mysql status
     ```

## Importing the Seed Data

### Step 1: Open MySQL Workbench

1. **Connect to MySQL Server:**
   - Open MySQL Workbench.
   - Click on the `+` button to create a new connection.
   - Enter the connection details (Hostname: `localhost`, Port: `3306`, Username: `root`, Password: `your_password`).
   - Click `Test Connection` to ensure the connection is successful.
   - Save and click on the new connection to connect to the MySQL server.

### Step 2: Import Seed Data

1. **Open the SQL Script File:**
   - Click on `File -> Open SQL Script`.
   - Select the `CSC422_Week 3 Assignment Seed Data1.sql` file.

2. **Execute the Script:**
   - Click on the lightning bolt icon in the toolbar to execute the script.
   - Alternatively, press `Ctrl+Shift+Enter`.

## Common Issues and Troubleshooting

### Issue: MySQL Service Starts and Stops Immediately

1. **Check MySQL Error Log:**
   - Locate the error log file:
     - **Windows**: `C:\ProgramData\MySQL\MySQL Server <version>\Data\`
     - **Linux/macOS**: `/var/log/mysql/` or `/var/log/mysqld.log`
   - Open the log file and check for specific error messages.

2. **Port Conflict:**
   - Ensure no other application is using port `3306`.
   - Change the MySQL port if necessary by editing the configuration file (`my.ini` or `my.cnf`):
     ```ini
     [mysqld]
     port = 3307
     ```

3. **InnoDB Issues:**
   - Delete `ib_logfile0` and `ib_logfile1` files in the MySQL data directory and restart the server.

4. **Configuration Errors:**
   - Validate the configuration file (`my.ini` or `my.cnf`) for syntax errors or invalid entries.

### Issue: Unable to Connect to MySQL Server

1. **Check Connection Settings:**
   - Ensure the hostname is `localhost` and port is `3306`.
   - Verify the username and password.

2. **Firewall and Port Configuration:**
   - Ensure the firewall is not blocking port `3306`.
   - Temporarily disable the firewall to test the connection.

3. **Test Connection from Command Line:**
   - Open Command Prompt or Terminal.
   - Run the following command to test the connection:
     ```bash
     mysql -u root -p
     ```

4. **Review MySQL Logs:**
   - Check the MySQL error log for detailed error messages.

If you encounter any issues that are not covered in this guide, please refer to the MySQL documentation or seek help from online forums and communities.

---

By following these instructions, you should be able to set up and run the MySQL database for the Tennis League Management System. If you encounter any issues, please refer to the troubleshooting section for common solutions.
