package per.piers.alexa.intent.response.providerImpl;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import per.piers.alexa.intent.response.provider.IntentResponseProvider;
import per.piers.alexa.speechlet.AlexaException;
import org.springframework.stereotype.Service;

@Service("AMAZON.StopIntent")
public class AMAZONStopIntentProvider implements IntentResponseProvider {

    @Override
    public SpeechletResponse getSpeechletResponse(SpeechletRequestEnvelope<IntentRequest> env) {
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText("OK");
        return SpeechletResponse.newTellResponse(speech);
    }

    @Override
    public SpeechletResponse getAlexaExceptionResponse(SpeechletRequestEnvelope<IntentRequest> env, AlexaException e) {
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText("Sorry");
        return SpeechletResponse.newTellResponse(speech);
    }

}