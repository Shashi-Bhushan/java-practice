FROM airhacks/glassfish
COPY ./target/java-practice.war ${DEPLOYMENT_DIR}
