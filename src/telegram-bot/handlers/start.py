from aiogram import Router, types
from aiogram.filters import CommandStart

router = Router()

@router.message(CommandStart())
async def startHandler(message: types.Message):
    await message.answer(
        "👋 Привет! Это техподдержка.\nНапиши свой вопрос, и оператор скоро ответит."
    )