describe('simple Test', function(){
    it('Scenario 1', function(){
        cy.visit("http://127.0.0.1:5500/Angular1.html.html");
    });

it('Scenario 2', function (){

    cy.get('[type="radio"]').first().check()
 });
 it('Scenario 3', function (){

    cy.get('[type="checkbox"]').first().check()
 });
 it('Scenario 4', function (){

    cy.get('[type="checkbox"]').check()
});
it('Scenario 5', function (){

    cy.get('[type="checkbox"]').uncheck()
});
it('Scenario 6', function (){

    cy.title().should('eq', 'Angular JS Forms')
 });
 it('Scenario 7', function (){

    cy.get('[name="firstname"]').type(' Ramesh')
    cy.get('[name="lastname"]').type('Nath')
    cy.get('[name="email"]').type('rameshnath369tp@gmail.com')
    });
it('Scenario 8', function (){

   cy.get('[value="NO"]').check()
     });
     it('Scenario 9', function (){

        cy.get('#Single').select('Single')
     });
     it('Scenario 10', function (){

        cy.get('#Single').select('Divorced')
     });

});