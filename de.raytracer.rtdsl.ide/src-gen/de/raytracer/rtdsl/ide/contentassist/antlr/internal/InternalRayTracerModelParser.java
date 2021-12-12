package de.raytracer.rtdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.raytracer.rtdsl.services.RayTracerModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRayTracerModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'box'", "'sphere'", "'camera'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRayTracerModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRayTracerModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRayTracerModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRayTracerModel.g"; }


    	private RayTracerModelGrammarAccess grammarAccess;

    	public void setGrammarAccess(RayTracerModelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalRayTracerModel.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRayTracerModel.g:54:1: ( ruleModel EOF )
            // InternalRayTracerModel.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRayTracerModel.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalRayTracerModel.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalRayTracerModel.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalRayTracerModel.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalRayTracerModel.g:69:3: ( rule__Model__Group__0 )
            // InternalRayTracerModel.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBox"
    // InternalRayTracerModel.g:78:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalRayTracerModel.g:79:1: ( ruleBox EOF )
            // InternalRayTracerModel.g:80:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalRayTracerModel.g:87:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:91:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalRayTracerModel.g:92:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalRayTracerModel.g:92:2: ( ( rule__Box__Group__0 ) )
            // InternalRayTracerModel.g:93:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalRayTracerModel.g:94:3: ( rule__Box__Group__0 )
            // InternalRayTracerModel.g:94:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleSphere"
    // InternalRayTracerModel.g:103:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalRayTracerModel.g:104:1: ( ruleSphere EOF )
            // InternalRayTracerModel.g:105:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalRayTracerModel.g:112:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:116:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalRayTracerModel.g:117:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalRayTracerModel.g:117:2: ( ( rule__Sphere__Group__0 ) )
            // InternalRayTracerModel.g:118:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalRayTracerModel.g:119:3: ( rule__Sphere__Group__0 )
            // InternalRayTracerModel.g:119:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleCamera"
    // InternalRayTracerModel.g:128:1: entryRuleCamera : ruleCamera EOF ;
    public final void entryRuleCamera() throws RecognitionException {
        try {
            // InternalRayTracerModel.g:129:1: ( ruleCamera EOF )
            // InternalRayTracerModel.g:130:1: ruleCamera EOF
            {
             before(grammarAccess.getCameraRule()); 
            pushFollow(FOLLOW_1);
            ruleCamera();

            state._fsp--;

             after(grammarAccess.getCameraRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCamera"


    // $ANTLR start "ruleCamera"
    // InternalRayTracerModel.g:137:1: ruleCamera : ( ( rule__Camera__Group__0 ) ) ;
    public final void ruleCamera() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:141:2: ( ( ( rule__Camera__Group__0 ) ) )
            // InternalRayTracerModel.g:142:2: ( ( rule__Camera__Group__0 ) )
            {
            // InternalRayTracerModel.g:142:2: ( ( rule__Camera__Group__0 ) )
            // InternalRayTracerModel.g:143:3: ( rule__Camera__Group__0 )
            {
             before(grammarAccess.getCameraAccess().getGroup()); 
            // InternalRayTracerModel.g:144:3: ( rule__Camera__Group__0 )
            // InternalRayTracerModel.g:144:4: rule__Camera__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Camera__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCameraAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCamera"


    // $ANTLR start "rule__Model__ElementAlternatives_2_0"
    // InternalRayTracerModel.g:152:1: rule__Model__ElementAlternatives_2_0 : ( ( ruleBox ) | ( ruleSphere ) | ( ruleCamera ) );
    public final void rule__Model__ElementAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:156:1: ( ( ruleBox ) | ( ruleSphere ) | ( ruleCamera ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRayTracerModel.g:157:2: ( ruleBox )
                    {
                    // InternalRayTracerModel.g:157:2: ( ruleBox )
                    // InternalRayTracerModel.g:158:3: ruleBox
                    {
                     before(grammarAccess.getModelAccess().getElementBoxParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getElementBoxParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRayTracerModel.g:163:2: ( ruleSphere )
                    {
                    // InternalRayTracerModel.g:163:2: ( ruleSphere )
                    // InternalRayTracerModel.g:164:3: ruleSphere
                    {
                     before(grammarAccess.getModelAccess().getElementSphereParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSphere();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getElementSphereParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRayTracerModel.g:169:2: ( ruleCamera )
                    {
                    // InternalRayTracerModel.g:169:2: ( ruleCamera )
                    // InternalRayTracerModel.g:170:3: ruleCamera
                    {
                     before(grammarAccess.getModelAccess().getElementCameraParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCamera();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getElementCameraParserRuleCall_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAlternatives_2_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalRayTracerModel.g:179:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:183:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRayTracerModel.g:184:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalRayTracerModel.g:191:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:195:1: ( ( 'model' ) )
            // InternalRayTracerModel.g:196:1: ( 'model' )
            {
            // InternalRayTracerModel.g:196:1: ( 'model' )
            // InternalRayTracerModel.g:197:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalRayTracerModel.g:206:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:210:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalRayTracerModel.g:211:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalRayTracerModel.g:218:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:222:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalRayTracerModel.g:223:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalRayTracerModel.g:223:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalRayTracerModel.g:224:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalRayTracerModel.g:225:2: ( rule__Model__NameAssignment_1 )
            // InternalRayTracerModel.g:225:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalRayTracerModel.g:233:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:237:1: ( rule__Model__Group__2__Impl )
            // InternalRayTracerModel.g:238:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalRayTracerModel.g:244:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:248:1: ( ( ( rule__Model__ElementAssignment_2 )* ) )
            // InternalRayTracerModel.g:249:1: ( ( rule__Model__ElementAssignment_2 )* )
            {
            // InternalRayTracerModel.g:249:1: ( ( rule__Model__ElementAssignment_2 )* )
            // InternalRayTracerModel.g:250:2: ( rule__Model__ElementAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getElementAssignment_2()); 
            // InternalRayTracerModel.g:251:2: ( rule__Model__ElementAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRayTracerModel.g:251:3: rule__Model__ElementAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ElementAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalRayTracerModel.g:260:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:264:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalRayTracerModel.g:265:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalRayTracerModel.g:272:1: rule__Box__Group__0__Impl : ( 'box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:276:1: ( ( 'box' ) )
            // InternalRayTracerModel.g:277:1: ( 'box' )
            {
            // InternalRayTracerModel.g:277:1: ( 'box' )
            // InternalRayTracerModel.g:278:2: 'box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalRayTracerModel.g:287:1: rule__Box__Group__1 : rule__Box__Group__1__Impl ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:291:1: ( rule__Box__Group__1__Impl )
            // InternalRayTracerModel.g:292:2: rule__Box__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalRayTracerModel.g:298:1: rule__Box__Group__1__Impl : ( ( rule__Box__NameAssignment_1 ) ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:302:1: ( ( ( rule__Box__NameAssignment_1 ) ) )
            // InternalRayTracerModel.g:303:1: ( ( rule__Box__NameAssignment_1 ) )
            {
            // InternalRayTracerModel.g:303:1: ( ( rule__Box__NameAssignment_1 ) )
            // InternalRayTracerModel.g:304:2: ( rule__Box__NameAssignment_1 )
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_1()); 
            // InternalRayTracerModel.g:305:2: ( rule__Box__NameAssignment_1 )
            // InternalRayTracerModel.g:305:3: rule__Box__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalRayTracerModel.g:314:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:318:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalRayTracerModel.g:319:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalRayTracerModel.g:326:1: rule__Sphere__Group__0__Impl : ( 'sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:330:1: ( ( 'sphere' ) )
            // InternalRayTracerModel.g:331:1: ( 'sphere' )
            {
            // InternalRayTracerModel.g:331:1: ( 'sphere' )
            // InternalRayTracerModel.g:332:2: 'sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalRayTracerModel.g:341:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:345:1: ( rule__Sphere__Group__1__Impl )
            // InternalRayTracerModel.g:346:2: rule__Sphere__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalRayTracerModel.g:352:1: rule__Sphere__Group__1__Impl : ( ( rule__Sphere__NameAssignment_1 ) ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:356:1: ( ( ( rule__Sphere__NameAssignment_1 ) ) )
            // InternalRayTracerModel.g:357:1: ( ( rule__Sphere__NameAssignment_1 ) )
            {
            // InternalRayTracerModel.g:357:1: ( ( rule__Sphere__NameAssignment_1 ) )
            // InternalRayTracerModel.g:358:2: ( rule__Sphere__NameAssignment_1 )
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_1()); 
            // InternalRayTracerModel.g:359:2: ( rule__Sphere__NameAssignment_1 )
            // InternalRayTracerModel.g:359:3: rule__Sphere__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Camera__Group__0"
    // InternalRayTracerModel.g:368:1: rule__Camera__Group__0 : rule__Camera__Group__0__Impl rule__Camera__Group__1 ;
    public final void rule__Camera__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:372:1: ( rule__Camera__Group__0__Impl rule__Camera__Group__1 )
            // InternalRayTracerModel.g:373:2: rule__Camera__Group__0__Impl rule__Camera__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Camera__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camera__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera__Group__0"


    // $ANTLR start "rule__Camera__Group__0__Impl"
    // InternalRayTracerModel.g:380:1: rule__Camera__Group__0__Impl : ( 'camera' ) ;
    public final void rule__Camera__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:384:1: ( ( 'camera' ) )
            // InternalRayTracerModel.g:385:1: ( 'camera' )
            {
            // InternalRayTracerModel.g:385:1: ( 'camera' )
            // InternalRayTracerModel.g:386:2: 'camera'
            {
             before(grammarAccess.getCameraAccess().getCameraKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCameraAccess().getCameraKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera__Group__0__Impl"


    // $ANTLR start "rule__Camera__Group__1"
    // InternalRayTracerModel.g:395:1: rule__Camera__Group__1 : rule__Camera__Group__1__Impl ;
    public final void rule__Camera__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:399:1: ( rule__Camera__Group__1__Impl )
            // InternalRayTracerModel.g:400:2: rule__Camera__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Camera__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera__Group__1"


    // $ANTLR start "rule__Camera__Group__1__Impl"
    // InternalRayTracerModel.g:406:1: rule__Camera__Group__1__Impl : ( ( rule__Camera__NameAssignment_1 ) ) ;
    public final void rule__Camera__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:410:1: ( ( ( rule__Camera__NameAssignment_1 ) ) )
            // InternalRayTracerModel.g:411:1: ( ( rule__Camera__NameAssignment_1 ) )
            {
            // InternalRayTracerModel.g:411:1: ( ( rule__Camera__NameAssignment_1 ) )
            // InternalRayTracerModel.g:412:2: ( rule__Camera__NameAssignment_1 )
            {
             before(grammarAccess.getCameraAccess().getNameAssignment_1()); 
            // InternalRayTracerModel.g:413:2: ( rule__Camera__NameAssignment_1 )
            // InternalRayTracerModel.g:413:3: rule__Camera__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Camera__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCameraAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera__Group__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalRayTracerModel.g:422:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:426:1: ( ( RULE_ID ) )
            // InternalRayTracerModel.g:427:2: ( RULE_ID )
            {
            // InternalRayTracerModel.g:427:2: ( RULE_ID )
            // InternalRayTracerModel.g:428:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ElementAssignment_2"
    // InternalRayTracerModel.g:437:1: rule__Model__ElementAssignment_2 : ( ( rule__Model__ElementAlternatives_2_0 ) ) ;
    public final void rule__Model__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:441:1: ( ( ( rule__Model__ElementAlternatives_2_0 ) ) )
            // InternalRayTracerModel.g:442:2: ( ( rule__Model__ElementAlternatives_2_0 ) )
            {
            // InternalRayTracerModel.g:442:2: ( ( rule__Model__ElementAlternatives_2_0 ) )
            // InternalRayTracerModel.g:443:3: ( rule__Model__ElementAlternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getElementAlternatives_2_0()); 
            // InternalRayTracerModel.g:444:3: ( rule__Model__ElementAlternatives_2_0 )
            // InternalRayTracerModel.g:444:4: rule__Model__ElementAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment_2"


    // $ANTLR start "rule__Box__NameAssignment_1"
    // InternalRayTracerModel.g:452:1: rule__Box__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:456:1: ( ( RULE_ID ) )
            // InternalRayTracerModel.g:457:2: ( RULE_ID )
            {
            // InternalRayTracerModel.g:457:2: ( RULE_ID )
            // InternalRayTracerModel.g:458:3: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__NameAssignment_1"


    // $ANTLR start "rule__Sphere__NameAssignment_1"
    // InternalRayTracerModel.g:467:1: rule__Sphere__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:471:1: ( ( RULE_ID ) )
            // InternalRayTracerModel.g:472:2: ( RULE_ID )
            {
            // InternalRayTracerModel.g:472:2: ( RULE_ID )
            // InternalRayTracerModel.g:473:3: RULE_ID
            {
             before(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__NameAssignment_1"


    // $ANTLR start "rule__Camera__NameAssignment_1"
    // InternalRayTracerModel.g:482:1: rule__Camera__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Camera__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRayTracerModel.g:486:1: ( ( RULE_ID ) )
            // InternalRayTracerModel.g:487:2: ( RULE_ID )
            {
            // InternalRayTracerModel.g:487:2: ( RULE_ID )
            // InternalRayTracerModel.g:488:3: RULE_ID
            {
             before(grammarAccess.getCameraAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCameraAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007002L});

}