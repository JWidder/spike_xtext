package de.raytracer.rtdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.raytracer.rtdsl.services.RayTracerModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRayTracerModelParser extends AbstractInternalAntlrParser {
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

        public InternalRayTracerModelParser(TokenStream input, RayTracerModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RayTracerModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRayTracerModel.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRayTracerModel.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRayTracerModel.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRayTracerModel.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_element_2_1 = null;

        EObject lv_element_2_2 = null;

        EObject lv_element_2_3 = null;



        	enterRule();

        try {
            // InternalRayTracerModel.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera ) ) )* ) )
            // InternalRayTracerModel.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera ) ) )* )
            {
            // InternalRayTracerModel.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera ) ) )* )
            // InternalRayTracerModel.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalRayTracerModel.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRayTracerModel.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRayTracerModel.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRayTracerModel.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRayTracerModel.g:101:3: ( ( (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRayTracerModel.g:102:4: ( (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera ) )
            	    {
            	    // InternalRayTracerModel.g:102:4: ( (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera ) )
            	    // InternalRayTracerModel.g:103:5: (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera )
            	    {
            	    // InternalRayTracerModel.g:103:5: (lv_element_2_1= ruleBox | lv_element_2_2= ruleSphere | lv_element_2_3= ruleCamera )
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
            	            // InternalRayTracerModel.g:104:6: lv_element_2_1= ruleBox
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getElementBoxParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_element_2_1=ruleBox();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getModelRule());
            	            						}
            	            						add(
            	            							current,
            	            							"element",
            	            							lv_element_2_1,
            	            							"de.raytracer.rtdsl.RayTracerModel.Box");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalRayTracerModel.g:120:6: lv_element_2_2= ruleSphere
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getElementSphereParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_element_2_2=ruleSphere();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getModelRule());
            	            						}
            	            						add(
            	            							current,
            	            							"element",
            	            							lv_element_2_2,
            	            							"de.raytracer.rtdsl.RayTracerModel.Sphere");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalRayTracerModel.g:136:6: lv_element_2_3= ruleCamera
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getElementCameraParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_element_2_3=ruleCamera();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getModelRule());
            	            						}
            	            						add(
            	            							current,
            	            							"element",
            	            							lv_element_2_3,
            	            							"de.raytracer.rtdsl.RayTracerModel.Camera");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBox"
    // InternalRayTracerModel.g:158:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalRayTracerModel.g:158:44: (iv_ruleBox= ruleBox EOF )
            // InternalRayTracerModel.g:159:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalRayTracerModel.g:165:1: ruleBox returns [EObject current=null] : (otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRayTracerModel.g:171:2: ( (otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRayTracerModel.g:172:2: (otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRayTracerModel.g:172:2: (otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRayTracerModel.g:173:3: otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
            		
            // InternalRayTracerModel.g:177:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRayTracerModel.g:178:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRayTracerModel.g:178:4: (lv_name_1_0= RULE_ID )
            // InternalRayTracerModel.g:179:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleSphere"
    // InternalRayTracerModel.g:199:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalRayTracerModel.g:199:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalRayTracerModel.g:200:2: iv_ruleSphere= ruleSphere EOF
            {
             newCompositeNode(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;

             current =iv_ruleSphere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalRayTracerModel.g:206:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'sphere' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRayTracerModel.g:212:2: ( (otherlv_0= 'sphere' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRayTracerModel.g:213:2: (otherlv_0= 'sphere' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRayTracerModel.g:213:2: (otherlv_0= 'sphere' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRayTracerModel.g:214:3: otherlv_0= 'sphere' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            // InternalRayTracerModel.g:218:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRayTracerModel.g:219:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRayTracerModel.g:219:4: (lv_name_1_0= RULE_ID )
            // InternalRayTracerModel.g:220:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSphereRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleCamera"
    // InternalRayTracerModel.g:240:1: entryRuleCamera returns [EObject current=null] : iv_ruleCamera= ruleCamera EOF ;
    public final EObject entryRuleCamera() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCamera = null;


        try {
            // InternalRayTracerModel.g:240:47: (iv_ruleCamera= ruleCamera EOF )
            // InternalRayTracerModel.g:241:2: iv_ruleCamera= ruleCamera EOF
            {
             newCompositeNode(grammarAccess.getCameraRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCamera=ruleCamera();

            state._fsp--;

             current =iv_ruleCamera; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCamera"


    // $ANTLR start "ruleCamera"
    // InternalRayTracerModel.g:247:1: ruleCamera returns [EObject current=null] : (otherlv_0= 'camera' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCamera() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRayTracerModel.g:253:2: ( (otherlv_0= 'camera' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRayTracerModel.g:254:2: (otherlv_0= 'camera' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRayTracerModel.g:254:2: (otherlv_0= 'camera' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRayTracerModel.g:255:3: otherlv_0= 'camera' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCameraAccess().getCameraKeyword_0());
            		
            // InternalRayTracerModel.g:259:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRayTracerModel.g:260:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRayTracerModel.g:260:4: (lv_name_1_0= RULE_ID )
            // InternalRayTracerModel.g:261:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCameraAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCamera"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007002L});

}