package fr.gantoin.views.edit;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import fr.gantoin.views.MainLayout;

@PageTitle("Edit")
@Route(value = "edit", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class EditView extends Composite<VerticalLayout> {

    public EditView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonSecondary = new Button();
        Button buttonSecondary2 = new Button();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary3 = new Button();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.XSMALL);
        buttonSecondary.setText("↓");
        buttonSecondary2.setText("↑");
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setHeightFull();
        layoutColumn3.addClassName(Gap.XSMALL);
        layoutColumn3.addClassName(Padding.XSMALL);
        layoutColumn3.setWidth(null);
        layoutRow2.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setHeightFull();
        layoutColumn4.addClassName(Gap.XSMALL);
        layoutColumn4.addClassName(Padding.XSMALL);
        layoutColumn4.setWidth(null);
        layoutColumn2.setHeightFull();
        layoutColumn2.addClassName(Padding.XSMALL);
        layoutRow2.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth(null);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidthFull();
        buttonPrimary.setText("Generate");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary3.setText("Read");
        layoutRow4.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.XSMALL);
        getContent().add(layoutRow);
        layoutRow.add(buttonSecondary);
        layoutRow.add(buttonSecondary2);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn3);
        layoutRow2.add(layoutColumn4);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(buttonPrimary);
        layoutRow3.add(buttonSecondary3);
        layoutColumn2.add(layoutRow4);
    }
}
