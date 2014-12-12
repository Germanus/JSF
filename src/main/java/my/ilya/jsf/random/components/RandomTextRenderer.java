package my.ilya.jsf.random.components;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;
import javax.faces.render.Renderer;

@FacesRenderer(componentFamily = RandomTextComponent.COMPONENT_FAMILY, rendererType = RandomTextRenderer.RENDERER_TYPE)
public class RandomTextRenderer extends Renderer {

	public static final String RENDERER_TYPE = "my.ilya.jsf.random.components.RandomTextRenderer";
	private static final Logger LOG = Logger.getLogger(RandomTextRenderer.class.getName());

	@Override
	public void encodeEnd(FacesContext context, UIComponent uiComponent) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		RandomTextComponent component = (RandomTextComponent) uiComponent;

		try {
			writer.startElement("div", component);
			writer.writeAttribute("id", component.getClientId(), "id");

			try {

				writer.write(component.getRandomText());

			} catch (IOException randomTextException) {
				writer.write(randomTextException.getMessage());
				LOG.log(Level.SEVERE, "Could not generate random text", randomTextException);
			}

			writer.endElement("div");
		} catch (IOException ex) {
			LOG.log(Level.SEVERE, "Could not generate markup", ex);
		}

	}

}
