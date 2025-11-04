import logging

def setupLogger(level: str = "INFO"):
    logging.basicConfig(
        format="%(asctime)s [%(levelname)s] %(name)s: %(message)s",
        level=getattr(logging, level.upper(), logging.INFO)
    )

    return logging.getLogger("support-bot")

logger = setupLogger()