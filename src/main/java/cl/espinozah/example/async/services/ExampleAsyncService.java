package cl.espinozah.example.async.services;

import java.util.logging.Logger;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ExampleAsyncService {

	private final Logger logger = Logger.getLogger(ExampleAsyncService.class.getName());

	@Async
	public void handleAsyncMethod() {
		logger.info("[handleAsyncMethod] init");

		try {
			Thread.sleep(2000);
			logger.info("2 seconds later");
		} catch (InterruptedException e) {
			logger.severe("[handleAsyncMethod] thread sleep error");
		}

		logger.info("[handleAsyncMethod] done");
	}

	public void handleMethod() {
		logger.info("[handleMethod] init");
		try {

			for (int i = 0; i < 10; i++) {
				logger.info("index: " + i + 1);
				Thread.sleep(500);
			}

		} catch (InterruptedException e) {
			logger.severe("[handleMethod] thread sleep error");
		}

		logger.info("[handleMethod] done");
	}
}
