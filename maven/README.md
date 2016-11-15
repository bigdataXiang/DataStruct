# maven
+ 官方文檔：http://maven.apache.org/

```
 <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
        <sourceDirectory>src</sourceDirectory>
        <outputDirectory>out</outputDirectory>
    </build>
```