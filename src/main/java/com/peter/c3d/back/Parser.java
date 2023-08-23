
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.peter.c3d.back;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\004\000\002\002\003\000\002\004" +
    "\004\000\002\004\003\000\002\005\006\000\002\003\003" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\003\005\000\002\003\003\000\002\003\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\004\015\004\001\002\000\004\013\012\001" +
    "\002\000\006\002\000\015\004\001\002\000\004\002\010" +
    "\001\002\000\006\002\ufffe\015\ufffe\001\002\000\004\002" +
    "\001\001\002\000\006\002\uffff\015\uffff\001\002\000\010" +
    "\010\015\012\014\015\013\001\002\000\016\004\ufff7\005" +
    "\ufff7\006\ufff7\007\ufff7\011\ufff7\014\ufff7\001\002\000\016" +
    "\004\ufffc\005\ufffc\006\ufffc\007\ufffc\011\ufffc\014\ufffc\001" +
    "\002\000\010\010\015\012\014\015\013\001\002\000\014" +
    "\004\020\005\023\006\017\007\022\014\021\001\002\000" +
    "\010\010\015\012\014\015\013\001\002\000\010\010\015" +
    "\012\014\015\013\001\002\000\006\002\ufffd\015\ufffd\001" +
    "\002\000\010\010\015\012\014\015\013\001\002\000\010" +
    "\010\015\012\014\015\013\001\002\000\016\004\ufffa\005" +
    "\ufffa\006\017\007\022\011\ufffa\014\ufffa\001\002\000\016" +
    "\004\ufff8\005\ufff8\006\ufff8\007\ufff8\011\ufff8\014\ufff8\001" +
    "\002\000\016\004\ufffb\005\ufffb\006\017\007\022\011\ufffb" +
    "\014\ufffb\001\002\000\016\004\ufff9\005\ufff9\006\ufff9\007" +
    "\ufff9\011\ufff9\014\ufff9\001\002\000\014\004\020\005\023" +
    "\006\017\007\022\011\031\001\002\000\016\004\ufff6\005" +
    "\ufff6\006\ufff6\007\ufff6\011\ufff6\014\ufff6\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\010\002\005\004\004\005\006\001\001\000" +
    "\002\001\001\000\004\005\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\003\015\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\027\001\001\000\002\001\001\000\004\003" +
    "\026\001\001\000\004\003\025\001\001\000\002\001\001" +
    "\000\004\003\024\001\001\000\004\003\023\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public Parser(Lexer lexer) {
        super(lexer);
    }

    //Metodo llamado automaticamente al encontrar error sintanctico

    public void syntax_error(Symbol s){
    

        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("Error Sintactico hallado");
        System.out.println("Lexema " + lexema + " linea"  + fila + " columna " + columna);
    }

    
    //Metodo llamado cuando no se puede recuperar de un error
    
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
    
        
        System.out.println("Error Sintactico hallado");
        System.out.println("Lexema " + lexema + " linea"  + fila + " columna " + columna);

            
    } 



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= c3d 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		  
                   
                
             
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // c3d ::= c3d asignacion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c3d",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // c3d ::= asignacion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c3d",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // asignacion ::= ID ASIGNACION exp PUNTO_COMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		
                                            
                        Manejador.asignar(id.toString());

                                            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("asignacion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // exp ::= NUMERO 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                        String tmp = Manejador.generarTemp();
                        Manejador.validar(n.toString(),"",5,tmp.toString());
                        RESULT = n;
                                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // exp ::= exp MAS exp 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                        String tmp = Manejador.generarTemp();
                        Manejador.validar("temp"+(Manejador.getContador()-3)+"","temp"+(Manejador.getContador()-2),1,tmp);
     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // exp ::= exp MENOS exp 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                        String tmp = Manejador.generarTemp();
                        Manejador.validar("temp"+(Manejador.getContador()-3)+"","temp"+(Manejador.getContador()-2),2,tmp);
     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // exp ::= exp MULTIPLICACION exp 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                        String tmp = Manejador.generarTemp();
                        Manejador.validar("temp"+(Manejador.getContador()-3)+"","temp"+(Manejador.getContador()-2),3,tmp);
     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exp ::= exp DIVISION exp 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                        String tmp = Manejador.generarTemp();
                        Manejador.validar("temp"+(Manejador.getContador()-3)+"","temp"+(Manejador.getContador()-2),4,tmp);
     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exp ::= ID 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                        String tmp = Manejador.generarTemp();
                        Manejador.validar(v1.toString(),"",5,tmp);
                        RESULT = v1;
     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exp ::= PABIERTO exp PCERRADO 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
                        RESULT = v1;
     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}