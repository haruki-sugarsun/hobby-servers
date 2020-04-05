package net.sickhack.markdowneditor.server;

import com.linecorp.armeria.common.logging.LogLevel;
import com.linecorp.armeria.server.annotation.Get;
import com.linecorp.armeria.server.annotation.decorator.LoggingDecorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;

@LoggingDecorator(
        requestLogLevel = LogLevel.INFO,            // Log every request sent to this service at INFO level.
        successfulResponseLogLevel = LogLevel.INFO  // Log every response sent from this service at INFO level.
)
public class EditorPageService {

    @Get("/index.html")
    public BufferedReader index() throws IOException {
        BufferedReader br = Files.newBufferedReader(Paths.get("/home/sweethacky/public_git/hobby-servers/markdown_editor/src/main/resources/index.html"), Charset.forName("UTF-8"));
        return br;
    }

}
