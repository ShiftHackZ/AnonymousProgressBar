import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class AnonymousProgressBarLafManagerListener implements LafManagerListener {

    public AnonymousProgressBarLafManagerListener() {
        updateProgressBarUI();
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        updateProgressBarUI();
    }

    private static void updateProgressBarUI() {
        UIManager.put("ProgressBarUI", AnonymousProgressBarUi.class.getName());
        UIManager.getDefaults().put(AnonymousProgressBarUi.class.getName(), AnonymousProgressBarUi.class);
    }
}
