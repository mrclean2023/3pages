# Start from the official Jenkins image
FROM jenkins/jenkins:lts

# Install Maven
USER root
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean

# Switch back to Jenkins user
USER jenkins

# Set the working directory (optional)
WORKDIR /var/jenkins_home

# Expose the port Jenkins runs on (default 8080)
EXPOSE 8080


