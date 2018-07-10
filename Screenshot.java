package suporte;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void printScreen(WebDriver driver, String arquivo) {

		TakesScreenshot camera = ((TakesScreenshot) driver);
		File imagem = camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, new File(arquivo));
		} catch (IOException e) {

			System.out.println("Ocorreu um erro ao copiar a imagem" + e.getMessage());
		}
	}

}
