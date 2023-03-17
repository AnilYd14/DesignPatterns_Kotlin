package com.example.designpatternssample

/**
 * Created by Anil Yadav on 16/03/23.
 */

enum class DialogType {
    DIALOG_CREATE_CHAT,
    DIALOG_DELETE_MESSAGE,
    DIALOG_EDIT_MESSAGE
}

interface Dialog {
    fun showDialog()
}

class CreateChatDialog() : Dialog {
    override fun showDialog() {

    }

}

class CreateDeleteMessageDialog() : Dialog {

    override fun showDialog() {
    }
}

class CreateEditMessageDialog() : Dialog {
    override fun showDialog() {
    }
}


object DialogFactory {

    fun createDialog(dialogType: DialogType): Dialog {

        return when (dialogType) {
            DialogType.DIALOG_CREATE_CHAT -> CreateChatDialog()
            DialogType.DIALOG_EDIT_MESSAGE -> CreateEditMessageDialog()
            DialogType.DIALOG_DELETE_MESSAGE -> CreateDeleteMessageDialog()
        }

    }


}