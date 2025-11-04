import asyncio
from aiogram import Bot, Dispatcher
from config import settings
from services.logger import logger
from handlers import start

async def main():
    bot = Bot(token=settings.BOT_TOKEN)
    dp = Dispatcher()

    dp.include_router(start.router)

    logger.info("Bot successfully started!")
    await dp.start_polling(bot)

if __name__ == "__main__":
    asyncio.run(main()) 