# Use an official Tomcat runtime as a parent image
FROM tomcat:10

# Remove the existing WAR file (if any)
RUN rm -rf /usr/local/tomcat/webapps/workshop.war

# Copy your WAR file to the Tomcat webapps directory
COPY target/workshop.war /usr/local/tomcat/webapps/workshop.war

ENV CATALINA_BASE=/usr/local/tomcat
ENV DB_HOST=mysql
ENV DB_PORT=3306
ENV DB_NAME=amazon
ENV DB_USER=root
ENV DB_PASSWORD=Yadhu

# Expose the default Tomcat port (8080)
EXPOSE 8080
# Start Tomcat
CMD ["catalina.sh", "run"]