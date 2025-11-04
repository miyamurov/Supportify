from pydantic_settings import BaseSettings

class Settings(BaseSettings):
    BOT_TOKEN: str
    BACKEND_URL: str = "http://localhost:8080/api"
    LOG_LEVEL: str = "INFO"

    class Config:
        env_file = ".env"

settings = Settings()